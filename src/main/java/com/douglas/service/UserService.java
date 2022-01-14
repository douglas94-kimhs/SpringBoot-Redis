package com.douglas.service;

import com.douglas.model.User;

import java.util.List;

public interface UserService {
    public boolean saveUser(User user);

    List<User> fetchAllUser();
}
