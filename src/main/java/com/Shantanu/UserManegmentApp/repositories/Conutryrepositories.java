package com.Shantanu.UserManegmentApp.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shantanu.UserManegmentApp.entities.Country;

public interface Conutryrepositories extends JpaRepository<Country, Serializable> {

}
