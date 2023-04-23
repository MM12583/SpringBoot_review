package com.frank.review.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {
	
	private Long idn;
	
	private String name;
	
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getIdn() {
		return idn;
	}

	public void setIdn(Long idn) {
		this.idn = idn;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(idn);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}
