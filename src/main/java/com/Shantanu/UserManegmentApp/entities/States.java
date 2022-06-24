package com.Shantanu.UserManegmentApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATES_MASTER")
public class States {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "States [id=" + id + ", state=" + state + "]";
	}
	
	 

}
