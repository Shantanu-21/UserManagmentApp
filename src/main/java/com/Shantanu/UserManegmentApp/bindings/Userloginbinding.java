package com.Shantanu.UserManegmentApp.bindings;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Userloginbinding {
	
	private String email;
	
	private String password;

}
