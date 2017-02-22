package com.demo.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.UserDao;
import com.demo.model.Users;


@Repository
@Transactional
public class UserDaoImpl implements UserDao {
@Autowired
private SessionFactory sessionFactory;

	public List<Users> getUsers() {
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("from Users");
		List<Users> users =query.list();
		return users;
	}

	public Users saveUsers(Users users) {
		// TODO Auto-generated method stub
		System.out.println(users.getUsersId());
		Session session=sessionFactory.openSession();
		session.save(users); //insert into users values (.....)
		session.flush();
		session.close();
		System.out.println(users.getUsersId());
		return users;
	}

}
