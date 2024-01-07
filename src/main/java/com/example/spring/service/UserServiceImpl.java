package com.example.spring.service;

import com.example.spring.entity.User;
import com.example.spring.exception.NotFoundException;
import com.example.spring.model.dto.UserDto;
import com.example.spring.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "Khanh", "khanh@gmail.com", "0327018337", "nghe an", "123123"));
                users.add(new User(2, "Quynh", "quynh@gmail.com", "89243824389", "hung yen", "1234"));
                users.add(new User(3, "Duy", "duy@gmail.com", "7812872178", "bac ninh", "2345"));
    }

    @Override
    public List<UserDto> getListUsers() {
        List<UserDto> result =  new ArrayList<UserDto>();
        for (User user : users ) {
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UserDto getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return UserMapper.toUserDto(user);
            }
        }
        throw new NotFoundException("User không tồn tại trong hệ thống!");
    }

    @Override
    public List<UserDto> getUsersByKeywords(String keywords) {
        List<UserDto> result =  new ArrayList<UserDto>();
        for (User user : users ) {
            if (user.getName().contains(keywords)) {
                result.add(UserMapper.toUserDto(user));
            }
        }
        return result;
    }
}
