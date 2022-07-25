package com.capg.App.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.App.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
		
	public User findByEmailAndPassword(String email,String password);

}
