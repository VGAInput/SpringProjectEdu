package com.skystudent.springprojectedu.service;

import com.skystudent.springprojectedu.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl {
    public static List<User> usersList = new ArrayList<>();
    public UserDaoImpl(List<User> usersList) {
        this.usersList = usersList;

        usersList.add(new User("Billy", usersList));
        usersList.add(new User("John", usersList));
        usersList.add(new User("Mary", usersList));
        usersList.add(new User("Anna", usersList));
        usersList.add(new User("Wilgelm", usersList));

    }

    public User getUserByName(String name) {
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getName().equals(name))
                return usersList.get(i);
        }
        return null;
    }

    public List<User> findAllUsers() {
        return usersList;
    }

    public void addNewUser(String newUserName){
        usersList.add(new User(newUserName,usersList));
    }


}
