package com.devmj.dscommerce.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.devmj.dscommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
