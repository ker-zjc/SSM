package com.tjetc.service.impl;

import com.tjetc.dao.UserMapper;
import com.tjetc.domain.User;
import com.tjetc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public boolean add(User user) {
		return userMapper.add(user)>0;
	}

	@Override
	public List<User> list() {
		return userMapper.list();
	}

	@Override
	public User findById(Integer id) {
		return userMapper.findById(id);
	}

	@Override
	public boolean update(User user) {
		return userMapper.update(user)>0;
	}

	@Override
	public boolean del(Integer id) {
		return userMapper.del(id)>0;
	}
}
