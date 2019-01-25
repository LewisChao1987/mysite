package com.buzz.mysite.service;

import com.buzz.mysite.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
      User getUser(int userId);
      User addUser(User user);
}
