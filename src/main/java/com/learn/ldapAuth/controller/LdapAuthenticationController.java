package com.learn.ldapAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LdapAuthenticationController {
	 @GetMapping("/")
	  public String index() {
	    return "Welcome to the home page!";
	  }
}
