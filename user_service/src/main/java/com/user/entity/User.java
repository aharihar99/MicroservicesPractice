package com.user.entity;

import java.util.ArrayList;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Long userId;
	private String name;
	private String phone;
	
//	@OneToMany
	List <Contact> contacts = new ArrayList<>();
	
	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	
}
