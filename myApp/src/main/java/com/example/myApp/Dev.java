package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    private Computer comp;

//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){

        comp.compile();

        System.out.println("working on Awesome Project");
    }
}
