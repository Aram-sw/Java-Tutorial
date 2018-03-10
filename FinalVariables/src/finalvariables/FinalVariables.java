/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalvariables;

/**
 *
 * @author Alaa-sw
 * 11.03.2018
 */
public class FinalVariables {
     
    public final int value = 10;
    
    // The following are examples of declaring constants:
   public static final int BOXWIDTH = 6;
   static final String TITLE = "Manager";

   public void changeValue() {
       // value = 12;   // will give an error
      // BOXWIDTH = 5; // will give an error
     // TITLE = "Entwickler"; // will give an error
   }
    
    
    public static void main(String[] args) {
        
       FinalVariables f = new FinalVariables();
       f.changeValue();
      // f.value =5; // will give an error
     //  f.TITLE="Alaa"; // will give an error
    //   f.BOXWIDTH = 8; // will give an error
        System.out.println(f.value);
        System.out.println(f.BOXWIDTH);
        System.out.println(f.TITLE);
       
    }
    
}
