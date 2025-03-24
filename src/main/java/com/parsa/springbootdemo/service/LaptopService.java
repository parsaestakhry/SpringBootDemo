package com.parsa.springbootdemo.service;

import com.parsa.springbootdemo.model.Laptop;
import org.springframework.stereotype.Service;


//responsible for dealing with repository, handling calculation and processing is done in this layer
@Service
public class LaptopService {

    public void addLaptop(Laptop laptop){
        System.out.println("Method called");
    }

    public boolean isGoodForProgramming(Laptop laptop){
        return  true;
    }

}
