package com.example.dao;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Customer;

@PersistenceContext(unitName = "adminEntityManagerFactory")
public interface CustomerDao extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}
