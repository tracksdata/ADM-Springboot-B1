package com.cts.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Reviews;

public interface ReviewsDao extends JpaRepository<Reviews, Integer>{

}
