package com.skystudent.springprojectedu.service;

import com.skystudent.springprojectedu.models.User;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.Silent.class)
class UserServiceTest {

    @Mock
    private UserDaoImpl userDao;
    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void checkUserExist(){

        User mockUser = userDao.getUserByName("Mock");

        when(userDao. getUserByName("Mock")).thenReturn(mockUser);
        when(userDao. getUserByName("Noname")).thenReturn(null);

        assertTrue(userService.checkUserExists(userDao.getUserByName("Mock")));
        assertFalse(userService.checkUserExists(userDao.getUserByName("Noname")));

    }

}