/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractmodifier;

/**
 *
 * @author Alaa-sw
 * 11.03.2018
 */
public class AbstractModifier {

   
    public static void main(String[] args) {
        
       /* SuperClass superClass = new SuperClass() {
            @Override
            void m() {
                System.out.println("Hallo");                
            }

            @Override
            int sum(int a, int b) {
                return a+b;
                
            }
        };
       
        superClass.m();
        System.out.println(superClass.sum(5, 5));
       */
       
       SubClass sub = new SubClass();
       sub.m();
       System.out.println(sub.sum(9, 2));
    }
    
}
