package com.Shantanu.UserManegmentApp.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Shantanu.UserManegmentApp.entities.Cities;
@Repository
public interface CitiesRepositories extends JpaRepository<Cities,Serializable> {

}
