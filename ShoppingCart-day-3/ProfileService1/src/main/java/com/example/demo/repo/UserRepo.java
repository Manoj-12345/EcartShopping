package com.example.demo.repo;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.User.UserProfile;
public interface UserRepo extends  MongoRepository<UserProfile, String> {
	UserProfile findProductById(String Id);

	UserProfile findbyMobileno(String mobileno);

	UserProfile findByName(String name);
	 


}
