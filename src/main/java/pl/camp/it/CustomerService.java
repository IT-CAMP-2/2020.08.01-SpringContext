package pl.camp.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerDAO customerDAO;

    @Override
    public void saveCustomerLogic() {
        customerDAO.saveCustomer();
        System.out.println("Logika zapisująca customera !!");
    }
}
