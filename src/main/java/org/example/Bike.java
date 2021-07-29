package org.example;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    public void drive() {
        System.out.println("The bile rides");
    }
}
