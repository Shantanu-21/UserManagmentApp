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
@AllArgsConstructor
@Entity
@Table(name = "STATES_MASTER")
public class States {
	@Id
	@Column(name ="USER_STATEID" )
	private Integer state_id;
	@Column(name ="USER_STATENAME" )
	private String state_name;
	@Column(name ="USER_COUNTRYID" )
	private Integer country_id;
}
