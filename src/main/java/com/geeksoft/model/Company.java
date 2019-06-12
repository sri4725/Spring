package com.geeksoft.model;

import java.util.List;

public class Company {
	private String name;
	private int companyId;
	
	private List<Address> addresses;
	
	public Company(String name, int companyId, List<Address> addresses) {
		this.setName(name);
		this.setCompanyId(companyId);
		this.setAddresses(addresses);
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
