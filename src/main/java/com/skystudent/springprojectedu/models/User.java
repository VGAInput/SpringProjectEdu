package com.skystudent.springprojectedu.models;

import java.util.List;

public class User {

    private String name;
    private int id;

    public User(String name,List<User> addIdWithList) {
        this.name = name;
        this.id = addIdWithList.size();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
