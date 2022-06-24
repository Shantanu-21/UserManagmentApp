package com.Shantanu.UserManegmentApp.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Shantanu.UserManegmentApp.entities.UserAccounts;
@Repository
public interface UserAccountrepositories extends JpaRepository<UserAccounts, Serializable> {

}
