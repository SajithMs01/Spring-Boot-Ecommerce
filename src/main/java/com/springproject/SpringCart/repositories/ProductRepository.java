package com.springproject.SpringCart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.SpringCart.models.product;

@Repository

public interface ProductRepository  extends JpaRepository<product, Long>{

	
}
