package com.cts.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.User;

public interface UserDao extends JpaRepository<User, String>{

}
