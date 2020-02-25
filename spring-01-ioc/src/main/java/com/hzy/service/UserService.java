package com.hzy.service;

import com.hzy.dao.UserDao;

public interface UserService {
    public void setUserDao(UserDao userDao);
    public void getUser();
}