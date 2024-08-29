package com.example.user_login.service.ServiceImpl;

import com.example.user_login.dto.UserDto;
import com.example.user_login.entity.UserEntity;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.user_login.repository.UserRepository;
import com.example.user_login.service.IUserLoginService;
import com.example.user_login.mapper.UserMapper;

import java.util.Optional;

@Service
public class UserLoginServiceImpl implements IUserLoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(UserDto userDto){
//        Optional<UserEntity> gotEntity = userRepository.findByEmail(userDto.getEmail());
        UserEntity userEntity = UserMapper.maptoUserEntity(userDto , new UserEntity());
        userRepository.save(userEntity);
    }

    @Override
    public boolean loginUser(UserDto userDto){
        Optional<UserEntity> gotEntity = userRepository.findByEmail(userDto.getEmail());
        if(gotEntity.isPresent()){
            return gotEntity.get().getPassword().equals(userDto.getPassword());
        }
        return false;
    }
}
