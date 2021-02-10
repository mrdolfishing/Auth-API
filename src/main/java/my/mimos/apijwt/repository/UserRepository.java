package my.mimos.apijwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.mimos.apijwt.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findOneByUsername(String name);

}
