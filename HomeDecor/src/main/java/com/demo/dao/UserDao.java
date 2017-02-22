package com.demo.dao;

import java.util.List;

import com.demo.model.Users;

public interface UserDao {

	List<Users> getUsers();
	Users saveUsers(Users users);

	
}
