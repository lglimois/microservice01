package fr.sh.springboot03.controller;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

	Customer findById(Integer id);
}
