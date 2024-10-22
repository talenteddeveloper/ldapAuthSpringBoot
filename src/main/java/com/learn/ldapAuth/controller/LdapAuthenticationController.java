package com.learn.ldapAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// youtube playlist ldap: https://www.youtube.com/playlist?list=PLyzY2l387AlO0KMY2Ydkzyxj1NgwtvR64
//  udemy ldap course link : https://www.udemy.com/share/10c2jr3@gXg1kvyeuFFQapv4E2gw0HJSi9gzWhNBOhYpOZd6zC04bgBjd4p9a3r-yUv8fEzoEg==/
@RestController
public class LdapAuthenticationController {
	 @GetMapping("/")
	  public String index() {
	    return "Welcome to the home page!";
	  }
}
