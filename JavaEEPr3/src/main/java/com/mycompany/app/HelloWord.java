package com.mycompany.app;

/**
 * Created by Stacy on 7/16/15.
 */
public class HelloWord {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public void printHello(){
        System.out.println("Spring Hello! "+ name);
    }
}
