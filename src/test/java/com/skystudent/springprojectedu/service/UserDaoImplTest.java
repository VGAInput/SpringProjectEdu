package com.skystudent.springprojectedu.service;

import com.skystudent.springprojectedu.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserDaoImplTest {

    UserDaoImpl udi = new UserDaoImpl(UserDaoImpl.usersList);

    @Test
    void getUserByName(){
        assertNotNull(udi.getUserByName("Billy"));
        assertNull(udi.getUserByName("Rumpelstilzchen"));
    }

}