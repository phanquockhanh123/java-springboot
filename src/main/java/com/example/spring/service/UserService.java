package com.example.spring.service;

import com.example.spring.entity.User;
import com.example.spring.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDto> getListUsers();

    public UserDto getUserById(int id);

    public List<UserDto> getUsersByKeywords(String keywords);
}
