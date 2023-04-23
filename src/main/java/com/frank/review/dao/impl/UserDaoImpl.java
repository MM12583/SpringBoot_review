package com.frank.review.dao.impl;

import org.springframework.stereotype.Repository;

import com.frank.review.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("User dao is runnig");
		
	}
	
}




