package com.skystudent.springprojectedu.service;

import com.skystudent.springprojectedu.models.User;

import java.util.List;

public class UserService {
    UserDaoImpl udi;

    public boolean checkUserExists(User user) {
        if (udi.getUserByName(user.getName()) == user) return true;
        else return false;
    }

}
