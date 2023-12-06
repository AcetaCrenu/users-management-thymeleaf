package com.example.thymeleaf.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.thymeleaf.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	

}
