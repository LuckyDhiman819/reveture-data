package com.revature.prf.dao;

import com.revature.prf.model.User;

public interface UserDAO {
	
	public boolean addUser(User user);
	public boolean validateUser(User user);

}
