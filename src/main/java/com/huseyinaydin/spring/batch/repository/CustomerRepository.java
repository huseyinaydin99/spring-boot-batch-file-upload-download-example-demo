package com.huseyinaydin.spring.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huseyinaydin.spring.batch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
