package com.devmj.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmj.dscommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
