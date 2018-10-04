package hibernateTransaction.service;

import hibernateTransaction.model.Customer;

import java.util.List;

/**
 * Created by eraym on 4.10.2018.
 */
public interface CustomerService {

    public void insertCustomerData(Customer customer);
    public List<Customer> listCustomer();
}
