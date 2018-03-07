/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariables;

/**
 *
 * @author Administrator
 */
public class Employee {
    
    // salary  variable is a private static variable
   private static double salary;

   // DEPARTMENT is a constant
   public static final String DEPARTMENT = "Development ";
   
   public static void setSalary(double amount)
   {
     salary = amount;
   }
   public static double getSalary()
   {
      return salary;
   }
}
