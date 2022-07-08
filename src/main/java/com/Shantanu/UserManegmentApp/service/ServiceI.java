package com.Shantanu.UserManegmentApp.service;

import java.util.Map;

import com.Shantanu.UserManegmentApp.bindings.Userloginbinding;

public interface ServiceI {
	
	public String login (Userloginbinding userloginbinding);
	
	 public Map<Integer, String> getCountrys();
	 public Map<Integer, String> getStates(Integer countryId);
     public Map<Integer, String> getCity(Integer stateId);
}
