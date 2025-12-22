package com.itheima.users.service;

import com.itheima.chap04.Result;
import com.itheima.users.dao.UserDatabase;
import com.itheima.users.entity.User;

public class UserService {

    private UserDatabase userDB = new UserDatabase();

    public Result register(String username, String password) {
        // 校验数据信息
        // 校验用户名
        if(isEmptyString(username)) {
            //用户名有误
            return Result.fail("用户名不能为空");
        }
        // 校验密码
        if(isEmptyString(password)) {
            return Result.fail("密码不能为空");
        }
        // 校验用户名是否存在
        User user = userDB.queryByUsername(username);
        if(user != null) {
            return Result.fail("用户名已存在！");
        }
        // 保存用户信息
        user = new User(username, password);
        userDB.save(user);
        return Result.ok(user);
    }

    public Result login(String username, String password) {
        // 校验基本信息
        if(isEmptyString(username) || isEmptyString(password)) {
            //用户名有误
            return Result.fail("用户名或密码不能为空");
        }
        // 根据用户名查询用户
        User user = userDB.queryByUsername(username);
        // 判断用户名是否存在
        if(user == null) {
            return Result.fail("用户名不存在");
        }
        // 判断密码是否正确
        if(!password.equals(user.getPassword())) {
            return Result.fail("密码不正确");
        }
        return Result.ok(user);
    }

    private static boolean isEmptyString(String str) {
        return str == null || str.equals("");
    }
}
