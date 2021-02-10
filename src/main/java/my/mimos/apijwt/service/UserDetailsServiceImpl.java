package my.mimos.apijwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.mimos.apijwt.entity.User;
import my.mimos.apijwt.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	public UserRepository userRepo;
	
	@Override
	public void createUser(User user) {
		
		userRepo.save(user);
	}

	
	@Override
	public User loginUser(String username, String password) {
		
		return userRepo.findOneByUsername(username);
	}

	//@Override
	//public User loadUserByUsername(String username) {
	//	return null;
	//}

}
