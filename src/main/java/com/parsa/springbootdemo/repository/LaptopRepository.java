package com.parsa.springbootdemo.repository;

import com.parsa.springbootdemo.model.Laptop;
import org.springframework.stereotype.Repository;


//responsible for dealing with databases
@Repository
public class LaptopRepository {

    public void save(Laptop laptop){
        System.out.println("Saved in database");
    }
}
