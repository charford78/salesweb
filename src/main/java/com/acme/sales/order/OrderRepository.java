package com.acme.sales.order;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	List<Order> findByCustomerIdNot(int customerId);
	Optional<Order> findByCustomerId(int customerId);
}
