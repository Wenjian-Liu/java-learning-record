package com.itheima.users;

import com.itheima.users.dao.UserDatabase;
import com.itheima.users.dao.UserDatabaseInMemory;
import com.itheima.users.service.UserService;
import com.itheima.users.service.UserServiceImpl;
import com.itheima.users.user.UserCMDUI;
import com.itheima.users.user.UserUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("启动");
        UserDatabase db = new UserDatabaseInMemory();
        UserService service =new UserServiceImpl(db);
        UserUI ui = new UserCMDUI(service);
        ui.entrance();
    }
}
