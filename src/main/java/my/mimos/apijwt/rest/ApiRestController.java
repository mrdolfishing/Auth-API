package my.mimos.apijwt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.mimos.apijwt.entity.User;
import my.mimos.apijwt.request.LoginForm;
import my.mimos.apijwt.service.UserDetailsService;

@RestController
@RequestMapping("api/auth")
public class ApiRestController {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody User user) {
		user.setId(0);
		userDetailsService.createUser(user);
		
		return ResponseEntity.ok("User Succefully Registered");
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody LoginForm loginForm) {
		User user = userDetailsService.loginUser(loginForm.getUsername(), 
				loginForm.getPassword());
		if (loginForm.getPassword().equals(user.getPassword())) {
			return ResponseEntity.ok("login successfull");
		}
		else {
			return ResponseEntity.ok("not found");
		}
		
		
	}

}
