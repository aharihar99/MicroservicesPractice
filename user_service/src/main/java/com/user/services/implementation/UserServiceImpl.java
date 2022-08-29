package com.user.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	//fake user list
	List <User>list =List.of(
			new User(101L,"Harihar Apamarjane", "98989898"),
			new User(102L,"Vedant Holey", "7878787878"),
			new User(103L,"Pratik Bhalse", "3939393939")
			);
	
	@Override
	public User getUser(Long id) {
		return this.list.stream()
				.filter(user->user.getUserId().equals(id))
				.findAny()
				.orElse(null); 
	}

}
