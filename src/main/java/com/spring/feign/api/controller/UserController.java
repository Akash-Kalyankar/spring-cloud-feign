package com.spring.feign.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.feign.api.client.UserClient;
import com.spring.feign.api.dto.UserResponse;

@RestController
@EnableFeignClients
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserClient client;
	
	@GetMapping("/findAllUsers")
	public List<UserResponse> getAllUsers(){
		return client.getUsers();
	}
}
