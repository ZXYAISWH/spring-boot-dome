package com.zxy.service;

import com.zxy.dao.UserDao;
import com.zxy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> selectAll(){
        return userDao.findAll();
    }

}
