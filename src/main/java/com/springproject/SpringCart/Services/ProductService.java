package com.springproject.SpringCart.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.SpringCart.models.product;
import com.springproject.SpringCart.repositories.ProductRepository;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository productRepository;
	
	public List<product> getAllProducts(){
		return productRepository.findAll();
		
	}
	
	
	
	
	
}
