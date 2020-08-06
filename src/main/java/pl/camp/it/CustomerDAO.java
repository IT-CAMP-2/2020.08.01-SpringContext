package pl.camp.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class CustomerDAO implements ICustomerDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void saveCustomer() {
        sessionFactory.openSession();
        System.out.println("Zapisuję customera !!");
    }
}
