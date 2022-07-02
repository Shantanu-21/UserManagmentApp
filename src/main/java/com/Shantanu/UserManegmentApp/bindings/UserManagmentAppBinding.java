package com.Shantanu.UserManegmentApp.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserManagmentAppBinding {
	
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String dob;
	private long num;
	private String gendar;
	private Integer city_id;
	private Integer state_id;
	private Integer country_id;

}
