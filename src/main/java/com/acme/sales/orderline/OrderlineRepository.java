package com.acme.sales.orderline;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.sales.customer.Customer;

public interface OrderlineRepository extends JpaRepository<Orderline, Integer>{

}
