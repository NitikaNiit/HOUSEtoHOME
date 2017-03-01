package com.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDao;
import com.demo.model.Users;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	/*public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();	
	}*/

	public Users saveOrUpdateUsers(Users users) {
		// TODO Auto-generated method stub
		return userDao.saveOrUpdateUsers(users);
	}

	
}


