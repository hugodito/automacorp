package com.emse.spring.automacorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DummyUserService implements UserService{

    private final GreetingService greetingService ;

    public DummyUserService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void greetAll(List<String> Names) {
        for (String names: Names) {
            //System.out.println("Hello, " + names + "!");
            greetingService.greet(names) ;
        }
    }

}
