package hibernateTransaction.dao;

import hibernateTransaction.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by eraym on 4.10.2018.
 */
@Repository
public class CustomerDaoImpl implements CustomerDao{

    private static final String All_Customers = "Select c from Customer c";

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void insertCustomer(Customer customer) {
        Session session = getCurrentSession();
        session.persist(customer);
    }

    @Override
    public List<Customer> findAllCustomer() {

        Session session = getCurrentSession();
        TypedQuery<Customer> query = session.createQuery(All_Customers,Customer.class);
        return query.getResultList();
    }
}
