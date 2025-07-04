package com.tap.shrutik.demo.emp_sys;

public class emp {
       protected int id ;
   protected String name ;
   protected double salary ;
   protected Address address;
   
public emp(int id, String name, double salary,Address address) {
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
