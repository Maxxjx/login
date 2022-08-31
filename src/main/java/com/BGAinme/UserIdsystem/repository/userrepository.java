package com.BGAinme.UserIdsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BGAinme.UserIdsystem.model.Userdetails;


@Repository
public interface userrepository extends JpaRepository<Userdetails,Integer> {

	
}

