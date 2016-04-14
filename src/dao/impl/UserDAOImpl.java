package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import dao.UserDAO;
import database.mapper.UserMapper;
import database.model.User;
import database.model.UserExample;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Resource
	private UserMapper userMapper;

	public User get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> find(Integer start, Integer limit) {
		UserExample example = new UserExample();
		example.setOffset(start);
		example.setLimit(limit);
		return userMapper.selectByExample(example);
	}

	public Integer countAll() {
		return userMapper.countByExample(null);
	}

}
