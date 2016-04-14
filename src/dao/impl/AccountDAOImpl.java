package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import dao.AccountDAO;
import database.mapper.AccountMapper;
import database.model.Account;

@Repository("accountDAO")
public class AccountDAOImpl implements AccountDAO {

	@Resource
	private AccountMapper accountMapper;

	public Account getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> find(Integer start, Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer countAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
