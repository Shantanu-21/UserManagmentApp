package com.Shantanu.UserManegmentApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY_MASTER")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String countory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountory() {
		return countory;
	}

	public void setCountory(String countory) {
		this.countory = countory;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countory=" + countory + "]";
	}
	
	

}
