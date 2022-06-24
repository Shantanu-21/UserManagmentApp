package com.Shantanu.UserManegmentApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Shantanu.UserManegmentApp.service.ServiceIMPL;

@RestController
public class Controller {
	@Autowired
	private ServiceIMPL serviceIMPL;
}
