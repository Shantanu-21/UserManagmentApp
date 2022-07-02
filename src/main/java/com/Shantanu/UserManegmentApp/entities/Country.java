package com.Shantanu.UserManegmentApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@Entity
@AllArgsConstructor
@Table(name = "COUNTRY_MASTER")
public class Country {
	@Id
	@Column(name ="USER_COUNTRYID" )
	private Integer country_id;
	@Column(name ="USER_COUNTRYNAME" )
	private String contryname;
	@Column(name ="USER_COUNTRYCODE")
	private Integer contrycode;
	
}
