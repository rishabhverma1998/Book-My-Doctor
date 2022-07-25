package com.capg.App.service;

import com.capg.App.dto.UserDTO;
import com.capg.App.entity.User;

public interface UserService {
	public User login(String email, String password);

    int signUpUser(UserDTO userDto);
}
