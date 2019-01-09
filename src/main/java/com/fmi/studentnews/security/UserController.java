package com.fmi.studentnews.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

  @RequestMapping("/user")
  public String email(Principal principal) {
    return "Hello " + principal.getName();
  }
}
