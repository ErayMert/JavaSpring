package hibernateTransaction.dao;

import hibernateTransaction.model.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by eraym on 4.10.2018.
 */
@Repository
public class AddressDaoImpl implements AddressDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void insertAddress(Address address) {
        Session session = getCurrentSession();
        session.persist(address);
    }
}
