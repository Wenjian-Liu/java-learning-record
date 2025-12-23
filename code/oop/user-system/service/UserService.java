package com.itheima.users.service;

import com.itheima.chap04.Result;

public interface UserService {
    Result register(String username, String password);

    Result login(String username, String password);
}
