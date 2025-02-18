package com.devmj.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmj.dscommerce.entities.OrderItem;
import com.devmj.dscommerce.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
