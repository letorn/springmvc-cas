package service;

import model.Pager;
import database.model.User;

public interface UserService {

	public Pager<User> page(Integer start, Integer limit);

}
