package com.tunehub.tunehub.controller;

import com.tunehub.tunehub.entities.Users;
import com.tunehub.tunehub.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {
    @Autowired
    UsersService service;

    @PostMapping("/register")
    public String addUsers(@ModelAttribute Users user) {

        service.addUser(user);

        return "home";
    }
}