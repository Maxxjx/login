package com.BGAinme.UserIdsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BGAinme.UserIdsystem.model.Userdetails;
import com.BGAinme.UserIdsystem.service.Userservice;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private Userservice userservice;
	
	@PostMapping("/add")
	public String add(@RequestBody Userdetails user) {
		userservice.saveuser(user);
		return "New User is Added";
		
	}
	
	
	

}
