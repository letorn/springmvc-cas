package service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import service.RoleService;
import dao.RoleDAO;
import database.model.Role;

@Service("roleService")
@Scope("prototype")
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleDAO roleDAO;

	public Role get(Integer id) {
		return null;
	}

}
