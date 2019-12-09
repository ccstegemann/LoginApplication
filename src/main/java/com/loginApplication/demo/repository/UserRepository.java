package com.loginApplication.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loginApplication.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
