package com.devmj.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmj.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
