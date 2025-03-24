package com.parsa.springbootdemo;

public class Desktop implements Computer {


    @Override
    public void compile() {
        System.out.println("Desktop is compiling...");
    }
}
