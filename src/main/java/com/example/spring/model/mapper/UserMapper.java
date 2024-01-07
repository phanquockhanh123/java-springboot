package com.example.spring.model.mapper;

import com.example.spring.entity.User;
import com.example.spring.model.dto.UserDto;

public class UserMapper {
    public static UserDto toUserDto(User user) {
        UserDto tmp = new UserDto();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setPhone(user.getPhone());
        tmp.setAddress(user.getAddress());
        tmp.setEmail(user.getEmail());

        return tmp;
    }
}
