package com.multithreding.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multithreding.entity.User;
import com.multithreding.service.UserService;



@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping(value = "/users")
    public CompletableFuture<ResponseEntity<?>> getAllUsers()
    {
        return userService.AllUsers().thenApply(ResponseEntity::ok);
        

    }

	
	 @GetMapping("/ThreadGet")
	    public ResponseEntity<?> getUsers() {
		 
	       CompletableFuture<List<User>>  users1=userService.AllUsers();
	       CompletableFuture<List<User>> users2=userService.AllUsers();
	       CompletableFuture<List<User>> users3=userService.AllUsers();
	       CompletableFuture<List<User>> users4=userService.AllUsers();
	       CompletableFuture<List<User>> users5=userService.AllUsers();
	       CompletableFuture<List<User>> users6=userService.AllUsers();
	       CompletableFuture<List<User>> users7=userService.AllUsers();
	       CompletableFuture<List<User>>users8=userService.AllUsers();
	       CompletableFuture<List<User>> users9=userService.AllUsers();
	       CompletableFuture<List<User>> users10=userService.AllUsers();
	       CompletableFuture<List<User>> users11=userService.AllUsers();
	       
	       
	       CompletableFuture.allOf(users1,users2,users3,users4,users5,users6,users7,users8,users9,users10,users11).join();

	       return ResponseEntity.status(HttpStatus.ACCEPTED).build();

	    }


	

}
