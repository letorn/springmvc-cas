package service.impl;

import javax.annotation.Resource;

import pojo.Role;
import service.RoleService;
import dao.RoleDAO;

public class RoleServiceImpl implements RoleService
{

    @Resource
    private RoleDAO roleDAO;

    public Role get(Integer id)
    {
        return null;
    }

}
