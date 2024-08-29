package com.example.user_login.mapper;

import com.example.user_login.dto.UserDto;
import com.example.user_login.entity.UserEntity;

public class UserMapper {

//    public static JobEntity mapToJobEntity(JobDto jobDto , JobEntity jobEntity){
//
//        jobEntity.setJobLocation(jobDto.getJobDescription());
//        jobEntity.setJobName(jobDto.getJobName());
//        jobEntity.setJobSkills(jobDto.getJobSkills());
//        jobEntity.setJobLocation(jobDto.getJobLocation());
//        return jobEntity;
//    }

    public static UserEntity maptoUserEntity(UserDto userDto , UserEntity userEntity){
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        return userEntity;
    }
}
