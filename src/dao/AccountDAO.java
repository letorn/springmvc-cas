package dao;

import java.util.List;

import database.model.Account;

public interface AccountDAO {

	public Account getByName(String name);

	public List<Account> find(Integer start, Integer limit);

	public Integer countAll();

}
