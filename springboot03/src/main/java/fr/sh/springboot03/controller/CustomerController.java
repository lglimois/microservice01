package fr.sh.springboot03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customer")
	public List<Customer> getCustomers()
	{
		return customerRepository.findAll();
	}

	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Integer id)
	{
		return customerRepository.findById(id);
	}

}
