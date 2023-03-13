package com.skystudent.springprojectedu.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
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
    private void checkUserExist(){

        userDao.addNewUser("Mock");

        when(userService.checkUserExists(userDao.getUserByName("Mock"))).thenReturn(true);
        when(userService.checkUserExists(userDao.getUserByName("Noname"))).thenReturn(false);
    }

}