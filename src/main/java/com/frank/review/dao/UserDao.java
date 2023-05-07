package com.frank.review.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.frank.review.entity.Users;

@Mapper
public interface UserDao {
	
	void save();
	
	@Select("SELECT * FROM users WHERE IDN = #{IDN}")
	Users getById(String idn);

}
