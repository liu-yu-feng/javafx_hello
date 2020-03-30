package com.liu.service;

import com.liu.dao.UserDao;
import com.liu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int deleteUser(User user) {
        return userDao.deleteUser(user);
    }

    public List<User> queryUser() {
        return userDao.queryUser();
    }

    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }
}
