package com.demo.service;

import com.demo.model.Users;

public interface UserService {
	/*public List<Users> getUsers();*/
	
	Users saveOrUpdateUsers(Users users);
}
