package com.aula.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.course.entities.OrderItem;
import com.aula.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
