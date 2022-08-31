package com.BGAinme.UserIdsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BGAinme.UserIdsystem.repository.userrepository;
import com.BGAinme.UserIdsystem.model.Userdetails;

@Service
public class Userserviceimplement implements Userservice {

	@Autowired
	private userrepository userrepository;
	
	@Override
	public Userdetails saveuser(Userdetails user) {
		// TODO Auto-generated method stub
		return userrepository.save(user);
	}
	
	

}
