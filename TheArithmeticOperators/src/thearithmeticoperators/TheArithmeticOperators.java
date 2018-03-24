/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thearithmeticoperators;

/**
 *
 * @author Alaa-sw
 * 24.03.2018
 */
public class TheArithmeticOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      int a = 10;
      int b = 20;
      int c = 25;
      int d = 25;

      System.out.println("a + b = " + (a + b) );
      System.out.println("a - b = " + (a - b) );
      System.out.println("a * b = " + (a * b) );
      System.out.println("b / a = " + (b / a) );
      System.out.println("b % a = " + (b % a) );
      System.out.println("c % a = " + (c % a) );
      System.out.println("a++   = " +  (a++) );
      System.out.println("a--   = " +  (a--) );

      // Check the difference in d++ and ++d
      System.out.println("d++   = " +  (d++) );
      System.out.println("++d   = " +  (++d) );
    }
    
}
