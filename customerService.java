package com.tnsif.customer1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class customerService 
{
	@Autowired
	private customerRepository repository;

	
	public List<customer>listAll()
	{
		return repository.findAll();
	}
	
	public customer get(Integer customerId)
	{
		return repository.findById(customerId).get();
	}
	public void save(customer cust)
	{
		repository.save(cust);
	}
	public void delete(Integer customerId)
	{
		repository.deleteById(customerId);
	}
}
