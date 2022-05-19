package com.sushmit.shoppingcart.models;

import com.sushmit.shoppingcart.models.data.Page;

import org.springframework.data.jpa.repository.JpaRepository;

  
public interface PageRepository extends JpaRepository<Page, Integer>{
  Page findBySlug(String slug);
}