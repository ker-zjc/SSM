package com.tjetc.service;

import com.tjetc.domain.User;

import java.util.List;

public interface UserService {
	boolean add(User user);

	List<User> list();

	User findById(Integer id);

	boolean update(User user);

	boolean del(Integer id);
}
