package com.Shantanu.UserManegmentApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shantanu.UserManegmentApp.repositories.CitiesRepositories;
import com.Shantanu.UserManegmentApp.repositories.Conutryrepositories;
import com.Shantanu.UserManegmentApp.repositories.StatesRepositories;
import com.Shantanu.UserManegmentApp.repositories.UserAccountrepositories;

@Service
public class ServiceIMPL implements ServiceI {

	@Autowired
	private CitiesRepositories citiesRepositories;
	@Autowired
	private StatesRepositories statesRepositories;
	@Autowired
	private Conutryrepositories conutryrepositories;
    @Autowired
	private UserAccountrepositories userAccountrepositories;

}
