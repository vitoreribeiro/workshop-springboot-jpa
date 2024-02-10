package com.projetodemo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetodemo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
