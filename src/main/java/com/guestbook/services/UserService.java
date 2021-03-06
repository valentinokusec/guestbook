package com.guestbook.services;

import java.util.List;

import com.guestbook.models.Reviewque;
import com.guestbook.models.Users;

public interface UserService {
	 public void addUser(Users user);
	    public List<Users> getAllUsers();
	    public void deleteUser(String user);
	    public List<Users> getUser(String user);
		public void setUser(String user,String lastname,String adress,String contact,String password,String email);

	    public Users getUserObject(String user);
}
