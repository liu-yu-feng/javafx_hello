package com.liu.service;

import com.liu.domain.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(User user);
    List<User> queryUser();
    User queryUserById(Integer id);
}
