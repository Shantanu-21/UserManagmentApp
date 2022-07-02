package com.Shantanu.UserManegmentApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Shantanu.UserManegmentApp.service.ServiceIMPL;

@Controller
public class UserController {
	@Autowired
	private ServiceIMPL serviceIMPL;
}
