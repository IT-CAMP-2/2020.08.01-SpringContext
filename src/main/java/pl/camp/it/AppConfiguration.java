package pl.camp.it;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public SessionFactory sessionFactory() {
        return new SessionFactory();
    }

    @Bean
    public ICustomerDAO customerDAO(SessionFactory sessionFactory) {
        CustomerDAO2 customerDAO = new CustomerDAO2();
        customerDAO.sessionFactory = sessionFactory;
        return customerDAO;
    }

    @Bean
    public ICustomerService customerService(ICustomerDAO customerDAO) {
        CustomerService customerService = new CustomerService();
        customerService.customerDAO = customerDAO;
        return customerService;
    }

    @Bean
    public GUI gui(ICustomerService customerService) {
        GUI gui = new GUI();
        gui.customerService = customerService;
        return gui;
    }
}
