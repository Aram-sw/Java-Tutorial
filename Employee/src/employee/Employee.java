/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Alaa-sw
 * 07.03.2018
 */
public class Employee {
    
    // this instance variable is visible for any child class.
    public String name;
    
    // // salary  variable is visible in Employee class only.
    private double salary;
    
    // The name variable is assigned in the constructor.
    public Employee(String empName)
    {
      name = empName;
    }
    
    // The salary variable is assigned a value.
    public void setSalary(double empSal)
    {
       salary = empSal;
    }
    
    // This method prints the employee details.
    public void printEmp()
    {
       System.out.println("name : " +name);
       System.out.println("salary : " +salary);
    }
    public static void main(String[] args) {
        
        Employee empOne = new Employee("Alaa");
        empOne.setSalary(2500);
        empOne.printEmp();
        
        Employee empTwo = new Employee("Yousef");
        empTwo.setSalary(3200);
        empTwo.printEmp();
        
        Employee empThree = new Employee("Mohammad");
        empThree.setSalary(9800);
        empThree.printEmp();
    }
    
}
