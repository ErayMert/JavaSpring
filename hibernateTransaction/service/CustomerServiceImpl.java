package hibernateTransaction.service;

import hibernateTransaction.dao.AddressDao;
import hibernateTransaction.dao.CustomerDao;
import hibernateTransaction.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by eraym on 4.10.2018.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private AddressDao addressDao;

    @Transactional
    @Override
    public void insertCustomerData(Customer customer) {
        customerDao.insertCustomer(customer);
        addressDao.insertAddress(customer.getAddress());
    }

    @Transactional
    @Override
    public List<Customer> listCustomer() {
        return customerDao.findAllCustomer();
    }
}
