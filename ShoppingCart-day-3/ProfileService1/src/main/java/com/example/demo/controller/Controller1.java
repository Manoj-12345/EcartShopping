package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.User.UserProfile;
import com.example.demo.repo.UserRepo;

import java.util.List;
@RestController
@RequestMapping("/profile1")
public class Controller1 {
	 @Autowired
	    private UserRepo profileRepository;

	    @GetMapping(value = "/list")
	    public List<UserProfile> getAllProfiles(){
	        return profileRepository.findAll();
	    }
	    @PostMapping(value = "/add")
	    public UserProfile addNewCustomerProfile(@RequestBody UserProfile up){
	        return profileRepository.save(up);
	    }
	    @DeleteMapping(value = "/delete/{profileID}")
	    public void deleteProfile(@PathVariable String profileID) {
	        System.out.println("Delete method called");
	        profileRepository.deleteById(profileID);
	    }
	    @PutMapping(value="/update/{id}")
	    public UserProfile updateProfile(@PathVariable UserProfile id) {
	    	return profileRepository.save(id);
	    }
	    @GetMapping(value="/phone/{mobileno}")
	    public UserProfile getByMobileno(@PathVariable String mobileno) {
	    	return profileRepository.findbyMobileno(mobileno);
	    }
	    @GetMapping(value="/name/{name}")
	    public UserProfile getByName(@PathVariable String name) {
	    	return profileRepository.findByName(name);
	    }
}
