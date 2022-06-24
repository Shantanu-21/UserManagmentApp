package com.Shantanu.UserManegmentApp.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shantanu.UserManegmentApp.entities.UserAccounts;

public interface UserAccountrepositories extends JpaRepository<UserAccounts, Serializable> {

}
