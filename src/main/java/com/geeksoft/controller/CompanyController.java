package com.geeksoft.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geeksoft.model.Address;
import com.geeksoft.model.Company;

@RestController
@RequestMapping (value = "/company")
public class CompanyController {
	@RequestMapping(value = "/indrika")
	public Company getCompanyDetails() {
		
		List<Address> addressList = new ArrayList<Address>();
		Address address= new Address(100, "Metroplax DR", "Edison", "NJ", "08817");
		addressList.add(address);
		Address address1= new Address(606,"Mindy Lane", "piscataway", "NJ", "08854");
		addressList.add(address1);
		Company company= new Company("Geeksoft", 1234, addressList);
		return company;
		
	}
	
	public Company phoneNumber() {
		
		return null;
	}
	

}

