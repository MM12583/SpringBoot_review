package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.frank.review.Application;
import com.frank.review.dao.UserDao;
import com.frank.review.entity.Users;

@SpringBootTest(classes = {Application.class}) // 啟動類
class FirstApplicationTests {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	void testGetUsers() {
		Users user = userDao.getById("B123999135");
		assertEquals("B123999135", user.getIdn());
		System.out.println(user);
	}
	
    @Test
    void contextLoads() {
    	userDao.save();
    }

}




	







