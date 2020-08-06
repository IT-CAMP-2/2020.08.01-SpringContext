package pl.camp.it;

import org.springframework.stereotype.Component;

@Component
public class SessionFactory {
    public void openSession() {
        System.out.println("zwracam sesję !!");
    }
}
