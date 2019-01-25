package com.buzz.mysite.service.impl;

import com.buzz.mysite.mapper.UserMapper;
import com.buzz.mysite.model.User;
import com.buzz.mysite.model.UserKey;
import com.buzz.mysite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public User getUser(int userId) {
        return  mapper.selectByPrimaryKey(userId);
    }

    @Override
    public User addUser(User user) {
       int r = mapper.insertSelective(user);
       if (r>0)
       {
           return  this.getUser(r);
       }
        return null;
    }
}
