package com.projetodemo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetodemo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
