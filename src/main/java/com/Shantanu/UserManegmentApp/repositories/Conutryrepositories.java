package com.Shantanu.UserManegmentApp.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Shantanu.UserManegmentApp.entities.Country;
@Repository
public interface Conutryrepositories extends JpaRepository<Country, Serializable> {

}
