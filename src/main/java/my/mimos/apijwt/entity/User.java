package my.mimos.apijwt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	
	@NotBlank
	@Size(min=3, max=50)
	//@Column(name="name")
	private String name;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	@Size(min=3, max=50)
	//@Column(name="username")
	private String username;
	
	@NotBlank
	@Size(min=6, max=50)
	//@Column(name="password") column hanya diguna jika parameter berbeza dengan DB
	private String password;
	
	
	public User(@NotBlank @Size(min=3, max=50) String name, 
			    @NotBlank @Size(min=3, max=50) String username,
			    @NotBlank @Size(min=3, max=50) String password) {
		
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}

}
