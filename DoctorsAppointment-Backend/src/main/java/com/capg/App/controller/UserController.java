 package com.capg.App.controller;

import java.util.Date;

import javax.servlet.ServletException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.App.dto.UserDTO;
import com.capg.App.entity.User;
import com.capg.App.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/signUp")
	public ResponseEntity<String> signUpUser(@Valid @RequestBody UserDTO userDto){
		userService.signUpUser(userDto);
		return new ResponseEntity<>("Registered" , HttpStatus.CREATED);
	}
	@GetMapping("/message")
	public String returnMessage() {
		return "Welcome!";
	}
	
	
//	  @PostMapping(path="/login",consumes =
//	  {MediaType.APPLICATION_FORM_URLENCODED_VALUE} , produces=
//	  {MediaType.APPLICATION_JSON_VALUE})
	 
	@PostMapping(path="/login")
	public String validate(@RequestBody User user) throws ServletException{
		String jwtToken = "";

		if (user.getEmail() == null || user.getPassword() == null) {
			throw new ServletException("Please fill in email and password");
		}

		String email = user.getEmail();
		String password = user.getPassword();

		user = userService.login(email, password);

		if (user == null) {
			throw new ServletException("User email not found.");
		}

		jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();

		return jwtToken;
	}
}