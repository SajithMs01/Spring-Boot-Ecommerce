package com.springproject.SpringCart;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springproject.SpringCart.models.product;
import com.springproject.SpringCart.repositories.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner{

	@Autowired
	private ProductRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// check if the table is empty
		if (repository.count() == 0) {
			// seed demo data
			List<product> products = Arrays.asList(
					new product("Redmi Note 11", 9888.00, "Latest Redmi smartphone with 5G support", 4.5, "Electronics",
							"Redmi", 50, 120),
					new product("Samsung Galaxy S21", 69999.00, "Premium smartphone with top-notch features", 4.7,
							"Electronics", "Samsung", 30, 200),
					new product("Apple iPhone 13", 79999.00, "Latest iPhone with advanced camera features", 4.8,
							"Electronics", "Apple", 20, 300));
			repository.saveAll(products);
			System.out.println("Demo data seeded");
		}
	}
}
