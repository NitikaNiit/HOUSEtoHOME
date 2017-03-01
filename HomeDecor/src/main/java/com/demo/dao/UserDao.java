package com.demo.dao;

import com.demo.model.Users;

public interface UserDao {

	/*List<Users> getUsers();*/
	Users saveOrUpdateUsers(Users users);

	
}
