package com.tjetc.dao;

import com.tjetc.domain.User;

import java.util.List;

public interface UserMapper {

	int add(User user);

	List<User> list();

	User findById(Integer id);

	int update(User user);

	int del(Integer id);
}
