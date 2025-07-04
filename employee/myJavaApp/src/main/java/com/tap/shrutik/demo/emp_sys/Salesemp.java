package com.tap.shrutik.demo.emp_sys;

public class Salesemp extends emp{
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
