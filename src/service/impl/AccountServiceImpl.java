package service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import service.AccountService;
import dao.AccountDAO;
import database.model.Account;

@Service("accountService")
@Scope("prototype")
public class AccountServiceImpl implements AccountService {

	@Resource
	private AccountDAO accountDAO;

	public Account getByName(String accountName) {
		return accountDAO.getByName(accountName);
	}

	public void updateAccount(Account account) {

	}

	public void reload() {

	}

}
