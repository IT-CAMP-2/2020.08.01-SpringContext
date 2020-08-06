package pl.camp.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GUI {

    @Autowired
    ICustomerService customerService;

    public void save() {
        System.out.println("logika zapisu customera !!");
        customerService.saveCustomerLogic();
    }
}
