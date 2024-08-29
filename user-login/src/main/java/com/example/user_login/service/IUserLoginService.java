package com.example.user_login.service;

import com.example.user_login.dto.UserDto;
import com.example.user_login.entity.UserEntity;

public interface IUserLoginService {

//    UserEntity registerUser(UserEntity userEntity);
    void registerUser(UserDto userDto);
    boolean loginUser(UserDto userdto);
}
