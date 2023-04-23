package com.junit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.frank.review.Application;
import com.frank.review.dao.UserDao;

@SpringBootTest(classes = {Application.class}) // 啟動類
class FirstApplicationTests {
	
	@Autowired
	private UserDao userDao;
	
    @Test
    void contextLoads() {
    	userDao.save();
    }

}




	







