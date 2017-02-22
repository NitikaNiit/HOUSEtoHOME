package com.demo.service;

import java.util.List;

import com.demo.model.Users;

public interface UserService {
	public List<Users> getUsers();
	
	Users saveUsers(Users users);
}
