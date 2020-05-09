package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Bean.UserBean;
@Repository
public interface UsersRepo extends CrudRepository<UserBean,String>{

	public UserBean findByEmail(String email);
	
		
	

}
