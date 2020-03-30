package com.liu.dao;

import com.liu.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao{
    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public int addUser(User user) {
        return sqlSession.getMapper(UserDao.class).addUser(user);
    }

    public int updateUser(User user) {
        return sqlSession.getMapper(UserDao.class).updateUser(user);
    }

    public int deleteUser(User user) {
        return sqlSession.getMapper(UserDao.class).deleteUser(user);
    }

    public List<User> queryUser() {
        return sqlSession.getMapper(UserDao.class).queryUser();
    }

    public User queryUserById(Integer id) {
        return sqlSession.getMapper(UserDao.class).queryUserById(id);
    }
}
