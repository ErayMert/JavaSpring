package hibernateTransaction.test;

import hibernateTransaction.model.Address;
import hibernateTransaction.model.Customer;
import hibernateTransaction.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eraym on 4.10.2018.
 */
public class SpringHibernateDeclarativeTransaction {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/hibernateTransaction/hibernateTransaction.xml");

        CustomerService customerService = context.getBean(CustomerService.class);

        //prepare Customer and Address data

        Address address = new Address(1,"Java Street", "34000", "Istanbul");
        Customer customer = new Customer(1,"Eray", "Mert");
        customer.setAddress(address);


        Address address2 = new Address(2,"Karakol Street", "06000", "Ankara");
        Customer customer2 = new Customer(2,"Onur", "Sal");
        customer2.setAddress(address2);

        Address address3 = new Address(2,"Alemdag Road", "34000", "Ankara");

        //duplicate Address id, throw exception
        //customer3 record will be rollbacked too
        Customer customer3 = new Customer(3,"Hakan", "Saban");
        customer2.setAddress(address3);


        customerService.insertCustomerData(customer);
        customerService.insertCustomerData(customer2);

        try{
            customerService.insertCustomerData(customer3);
        }catch (Exception e){
            System.out.println("Rollaback....");
            System.out.println(e.getMessage());
        }

        System.out.println("Customer List: ");
        for (Customer c : customerService.listCustomer()){
            System.out.println(c);
        }

        ((ClassPathXmlApplicationContext)context).close();
    }
}
