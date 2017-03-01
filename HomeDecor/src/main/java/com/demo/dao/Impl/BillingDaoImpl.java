package com.demo.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.BillingDao;
import com.demo.model.BillingAddress;

@Repository
@Transactional
public class BillingDaoImpl implements BillingDao {
	@Autowired
	private SessionFactory sessionFactory;

	/*public List<BillingAddress> getBillingAddress() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("from BillingAddress");
		List<BillingAddress> billing =query.list();
		return billing;
	}*/

	public BillingAddress saveOrUpdateBillingAddress(BillingAddress billing) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(billing); //insert into BillingAdress values (.....)
		session.flush();
		session.close();
		System.out.println(billing.getBillsId());
		return billing;
	}
	
}
