package com.Shantanu.UserManegmentApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "CITIES_MASTER")
public class Cities {

	@Id
	@Column(name ="USER_CITYID" )
	private Integer city_id;
	@Column(name ="USER_CITYNAME" )
	private String city_name;
	@Column(name ="USER_STATEID" )
	private Integer state_id;

}
