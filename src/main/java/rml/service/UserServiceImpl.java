package rml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import rml.dao.UserMapper;
import rml.model.User;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	
	public boolean login(String name, String password) {
		User user = userMapper.login(name, password);
		if ( user == null) {
			return false;
		} else {
			return true;
		}
	}

}
