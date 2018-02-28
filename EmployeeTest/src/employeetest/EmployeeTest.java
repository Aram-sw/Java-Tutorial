/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

/**
 *
 * @author Administrator
 */
import java.io.*;

public class EmployeeTest {

    
    public static void main(String[] args) {
       /* Create two objects using constructor */
          Employee empOne = new Employee("Alaa Alswedan");
          Employee empTwo = new Employee("Dalal Jabri");

       // Invoking methods for each object created
          empOne.empAge(28);
          empOne.empDesignation("Senior Software Engineer");
          empOne.empSalary(3250);
          empOne.printEmployee();

          empTwo.empAge(28);
          empTwo.empDesignation("Software Engineer");
          empTwo.empSalary(3000);
          empTwo.printEmployee();
    }
    
}
