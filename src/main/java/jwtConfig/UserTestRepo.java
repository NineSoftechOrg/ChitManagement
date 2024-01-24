package jwtConfig;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
	public interface UserTestRepo extends JpaRepository<UserTest, Integer> { 
	    Optional<UserTest> findByName(String username); 
	}


