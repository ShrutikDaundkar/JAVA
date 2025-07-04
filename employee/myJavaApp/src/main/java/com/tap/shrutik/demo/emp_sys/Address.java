package com.tap.shrutik.demo.emp_sys;

public class Address {
    String state;
    String city ;
    int zip ;

    Address(String state , String city , int zip){
        this.state= state;
       this.city=city;
       this.zip=zip;

    }
    public void display(){
        System.out.println("state is:- "+state + "  city:- "+city + "  zip:-" +zip);
    }
}
