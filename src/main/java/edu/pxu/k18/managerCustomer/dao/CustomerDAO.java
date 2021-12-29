package edu.pxu.k18.managerCustomer.dao;

import java.util.List;

import edu.pxu.k18.managerCustomer.entity.Customer;

public interface CustomerDAO {
	  public List < Customer > getCustomers();

	    public void saveCustomer(Customer theCustomer);

	    public Customer getCustomer(int theId);

	    public void deleteCustomer(int theId);
}
