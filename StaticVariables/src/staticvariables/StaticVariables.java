/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariables;

/**
 *
 * @author Alaa-sw
 * 07.03.2018
 */


public class StaticVariables {

    public static void main(String[] args) {
        
        Employee.setSalary(3200);       
        System.out.println(Employee.DEPARTMENT);
        System.out.println(Employee.getSalary());
    }
    
}
