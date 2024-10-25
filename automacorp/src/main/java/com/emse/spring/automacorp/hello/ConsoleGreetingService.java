package com.emse.spring.automacorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsoleGreetingService implements GreetingService{

    @Override
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
