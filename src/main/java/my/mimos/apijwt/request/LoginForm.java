package my.mimos.apijwt.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm {
	
	@NotBlank
	@Size(min=6, max=60)
	private String username;
	
	@NotBlank
	@Size(min=6, max=60)
	private String password;
	

	

}
