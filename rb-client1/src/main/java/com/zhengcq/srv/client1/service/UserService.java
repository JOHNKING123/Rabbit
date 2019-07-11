package com.zhengcq.srv.client1.service;

import com.zhengcq.srv.client1.dao.UserDao;
import com.zhengcq.srv.client1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getByUserId(Long userId){
        return userDao.getByUserId(userId);
    }
}
