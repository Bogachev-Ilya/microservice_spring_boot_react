package com.developer.microusermanager.service;

import com.developer.microusermanager.model.User;
import com.developer.microusermanager.repository.UserRepository;

import java.util.List;

public interface UserService{
    User save(User user);

    User findByUsername(String username);

    List<String> findUsers(List<Long> idList);
}
