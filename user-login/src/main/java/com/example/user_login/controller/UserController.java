package com.example.user_login.controller;

import com.example.user_login.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.user_login.service.IUserLoginService;
import com.example.user_login.service.ServiceImpl.UserLoginServiceImpl;

@RestController
//@RequestMapping("/api")
//@RequestMapping("/api")
public class UserController {
    //create - post
    //read - get
    //update - put
    // delete - delete
    @Autowired
    private IUserLoginService iUserLoginService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDto userDto) {
        iUserLoginService.registerUser(userDto);
//        return new ResponseEntity<>("User successfully created", HttpStatus.CREATED);
        return ResponseEntity.status(HttpStatus.OK).body("Job successfully created");
    }

    @PostMapping("/userlogin")
    public ResponseEntity<String> loginUser(@RequestBody UserDto userDto){
        boolean isAuthenticated = iUserLoginService.loginUser(userDto);
        if(isAuthenticated){
            return new ResponseEntity<>("Login successful", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Invalid email or password", HttpStatus.UNAUTHORIZED);
        }
    }
}
