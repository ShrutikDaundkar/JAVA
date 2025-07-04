package com.tap.shrutik.demo;


public class App 
{
   protected int id ;
   protected String name ;
   protected double salary ;
   protected Address address;
   
public App(int id, String name, double salary,Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;

       
    }

public void display(){
   System.out.println("ID: " + id + ", Name: " + name + ", Salary is: " + salary);
    address.display();
}
public static void main (String args[]){
    Address adrss= new Address("Maharashtra","pune",410505);
     
    Salesemp se= new Salesemp(10 ,"ram", 10000, 1000000000,adrss);
    se.address = adrss;

     se.display();


}


}

 class Salesemp extends App{
    private double commision ;

   public Salesemp(int id, String name, double salary, double commision , Address address){
          super(id , name , salary, address);
    this.commision=commision;
   }
public void display(){
    super.display();
    System.out.println("commision is "+ commision);
}
}

class Address{

    String state;
    String city ;
    int zip ;

    Address(String state , String city , int zip){
        this.state= state;
       this.city=city;
       this.zip=zip;

    }
    public void display(){
        System.out.println("state is"+state + "city"+city + "zip");
    }
        }
           






    
