package com.dragon.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragon.dao.user.UserDao;
import com.dragon.pojo.User;
import com.dragon.service.user.UserService;
@Service
public class UserServciceImpl implements UserService {
    @Autowired
	private UserDao userDao;
	@Override
	public User validation(String account, String password) {
		return userDao.validation(account, password);
	}

}
