package com.dt.de.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dt.de.jpa.repository.UserRepository;
import com.dt.de.model.Login;
import com.dt.de.model.User;



@RestController
@RequestMapping(path="/dtUser")
@CrossOrigin
public class UserController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/dtAuthenticateUser")
	public Login validateUser(@RequestBody User user) {
		LOGGER.info("Input Details : User : "+user);
		Login loginData = new Login();
		List<User> userDetails = userRepository.findByUSERNAME(user.getUSERNAME());
		LOGGER.info("Result Details : User : "+userDetails);
		if(userDetails.isEmpty()) {
			loginData.setMessage("Username/password is incorrect");
		}else {
			LOGGER.info("User exists");
			if(user.getPASSWORD() != null && !user.getPASSWORD().isEmpty()) {
				if((user.getPASSWORD()).equals(userDetails.get(0).getPASSWORD())) {
					loginData.setuSERNAME(userDetails.get(0).getUSERNAME());
					loginData.setUSERID(userDetails.get(0).getUSERID());
					loginData.setMessage("Login is successful");
				}else {
					loginData.setMessage("Username/password is incorrect");
				}
			}else {
				loginData.setMessage("Username/password is incorrect");
			}
		}
		LOGGER.info("loginData : "+loginData);
		return loginData;
	}
}
