package edu.pxu.k18.managerCustomer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pxu.k18.managerCustomer.dao.CustomerDAO;
import edu.pxu.k18.managerCustomer.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	 @Autowired
	    private CustomerDAO customerDAO;

	    @Override
	    @Transactional
	    public List < Customer > getCustomers() {
	        return customerDAO.getCustomers();
	    }

	    @Override
	    @Transactional
	    public void saveCustomer(Customer theCustomer) {
	        customerDAO.saveCustomer(theCustomer);
	    }

	    @Override
	    @Transactional
	    public Customer getCustomer(int theId) {
	        return customerDAO.getCustomer(theId);
	    }

	    @Override
	    @Transactional
	    public void deleteCustomer(int theId) {
	        customerDAO.deleteCustomer(theId);
	    }
}
