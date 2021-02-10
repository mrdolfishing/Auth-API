package my.mimos.apijwt.service;

import my.mimos.apijwt.entity.User;

public interface UserDetailsService {
	
	//User loadUserByUsername(String username);
	
	public void createUser(User user);
	
	public User loginUser(String username, String password);

}
