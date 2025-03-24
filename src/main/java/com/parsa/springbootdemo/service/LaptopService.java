package com.parsa.springbootdemo.service;

import com.parsa.springbootdemo.model.Laptop;
import org.springframework.stereotype.Service;


@Service
public class LaptopService {

    public void addLaptop(Laptop laptop){
        System.out.println("Method called");
    }

    public boolean isGoodForProgramming(Laptop laptop){
        return  true;
    }

}
