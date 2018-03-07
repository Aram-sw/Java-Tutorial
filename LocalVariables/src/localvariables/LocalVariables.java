/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localvariables;

/**
 *
 * @author Alaa-sw
 * 06.03.2018
 */
public class LocalVariables {

    public void pupAge()
    {
        int age = 0; 
        // int age; // it would give an error at the time of compilation.
        age = age +7;
        System.out.println("Puppy age is : " + age );
    }
    
    public static void main(String[] args) {
       LocalVariables test = new LocalVariables();
       test.pupAge(); 
    } 
}
