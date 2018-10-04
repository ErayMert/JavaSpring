package hibernateTransaction.dao;

import hibernateTransaction.model.Customer;

import java.util.List;

/**
 * Created by eraym on 4.10.2018.
 */
public interface CustomerDao {
    public void insertCustomer(Customer customer);
    public List<Customer> findAllCustomer();
}
