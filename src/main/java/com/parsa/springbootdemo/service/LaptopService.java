package com.parsa.springbootdemo.service;

import com.parsa.springbootdemo.repository.LaptopRepository;
import com.parsa.springbootdemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//responsible for dealing with repository, handling calculation and processing is done in this layer
@Service
public class LaptopService {


    @Autowired
    private LaptopRepository laptopRepository;
    public void addLaptop(Laptop laptop){
        laptopRepository.save(laptop);
        System.out.println("Method called");
    }

    public boolean isGoodForProgramming(Laptop laptop){
        return  true;
    }

}
