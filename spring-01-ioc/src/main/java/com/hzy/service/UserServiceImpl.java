package com.hzy.service;
import com.hzy.dao.UserDao;

public class UserServiceImpl implements UserService {
    UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void getUser() {
        userDao.getUser();
    }
}