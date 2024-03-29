package jwtConfig;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
	public class UserTestService implements UserDetailsService { 
	  
	    @Autowired
	    private UserTestRepo repository; 
	  
	    @Autowired
	    private PasswordEncoder encoder; 
	  
	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { 
	  
	        Optional<UserTest> userDetail = repository.findByName(username); 
	  
	        // Converting userDetail to UserDetails 
	        return userDetail.map(UserInfoDetails::new) 
	                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username)); 
	    } 
	  
	    public String addUser(UserTest userTest) { 
	        userTest.setPassword(encoder.encode(userTest.getPassword())); 
	        repository.save(userTest); 
	        return "User Added Successfully"; 
	    }

}
