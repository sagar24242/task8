package com.multithreding.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.multithreding.entity.User;
import com.multithreding.repositry.UserRepositry;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepositry userRepositry;
	
	 @Async
	    public CompletableFuture<List<User>> AllUsers()
	    {
	        System.out.println("current thread"+Thread.currentThread().getName());
	        List<User> users=userRepositry.findAll();
	        return CompletableFuture.completedFuture(users);

	    }
	
}
