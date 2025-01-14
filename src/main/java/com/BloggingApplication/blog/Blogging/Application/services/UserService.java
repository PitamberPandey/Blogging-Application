package com.BloggingApplication.blog.Blogging.Application.services;

import com.BloggingApplication.blog.Blogging.Application.payloads.UserDto;


import java.util.List;


public interface UserService {
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user,Integer Id);
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUser();
    void deleteUser(Integer userId);


}
