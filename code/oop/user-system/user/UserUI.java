package com.itheima.users.user;

import com.itheima.chap04.Result;
import com.itheima.users.entity.User;
import com.itheima.users.service.UserService;

import java.util.Scanner;

public class UserUI {
    private Scanner sc = new Scanner(System.in);
    private UserService userService = new UserService();
    public void entrance() {
        while (true) {
            System.out.println("欢迎进入用户中心：");
            System.out.println("1.用户注册");
            System.out.println("2.用户登录");
            System.out.println("3.退出");
            System.out.print("请输入您的选择：");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    registerUI();
                    break;
                case 2:
                    loginUI();
                    return;
                case 3:
                    System.out.println("欢迎下次访问，再见！");
                    return;
                default:
                    System.out.println("输入有误！请重新输入！");
                    break;
        }

        }
    }

    private void registerUI() {
        while (true) {
            String username = nextString("请输入用户名：");
            String password = nextString("请输入密码：");
            String confirmPassword = nextString("请确认密码：");
            if (username == null || password == null || confirmPassword == null) {
                System.out.println("用户名或密码不得为空");
                continue;
            }
            // 判断密码是否一致
            if (!password.equals(confirmPassword)) {
                System.out.println("密码不一致！请重新输入！");
                continue;
            }
            Result result = userService.register(username, password);
            if(result.isSuccess()) {
                System.out.println("注册成功！");
                User user = (User) result.getData();
                System.out.println("您的用户编号：" + user.getId());
                return;
            }
            System.out.println("注册失败！" + result.getMsg());
            String option = nextString("是否需要重试？（y/n）");
            if (option.equalsIgnoreCase("n")) {
                return;
            }
        }
    }

    private String nextString(String prompt) {
        System.out.print(prompt);
        return sc.next();
    }

    private void loginUI() {
        while (true) {
            String username = nextString("请输入用户名：");
            String password = nextString("请输入密码：");
            Result result = userService.login(username, password);
            if (result.isSuccess()) {
                User user = (User) result.getData();
                System.out.println("欢迎回来，" + user.getUsername());
                return;
            }
            System.out.println("登录失败！" + result.getMsg());
            String option = nextString("是否需要重试？（y/n）");
            if (option.equalsIgnoreCase("n")) {
                return;
            }
        }
    }
}
