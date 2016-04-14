package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import dao.RoleDAO;
import database.mapper.RoleMapper;
import database.model.Role;

@Repository("roleDAO")
public class RoleDAOImpl implements RoleDAO {

	@Resource
	private RoleMapper roleMapper;

	public Role get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Role> find(Integer start, Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer countAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Role role) {
		// TODO Auto-generated method stub
		return false;
	}



}
