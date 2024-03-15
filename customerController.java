package com.tnsif.customer1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customerController 
{
	@Autowired
	private customerService service;
	
	
	//retrieval
	@GetMapping("/customers")
	public List<customer> list()
	{
		return service.listAll();
		
	}

	//retrieve by id
	@GetMapping("/customers/{customerId}")
	
	public ResponseEntity get(@PathVariable Integer customerId)
	{
		try {
			customer cust=service.get(customerId);
					return new ResponseEntity<customer>(cust,HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<customer>(HttpStatus.NOT_FOUND);
		}
	}
	//Create
	@PostMapping("/customers")
	public void add(@RequestBody customer cust)
	{
		service.save(cust);
	}
	//Update
	@PutMapping("/customers/{customerId}")
	public ResponseEntity<?>update(@RequestBody customer cust,@PathVariable Integer customerId )
	{
		try {
			customer existcustomer=service.get(customerId);
			service.save(cust);
			return new ResponseEntity<>(HttpStatus.OK);
		} 
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//delete
	@DeleteMapping("/customers/{custmerId}")
	public void delete(@PathVariable Integer customerId)
	{
		service.delete(customerId);
	}
}
