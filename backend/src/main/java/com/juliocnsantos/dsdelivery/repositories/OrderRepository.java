package com.juliocnsantos.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliocnsantos.dsdelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
