/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

/**
 *
 * @author Administrator
 */
public class Sum {

    public  float sumFloat(float a , float b , float c)
       {

          return  a + b + c;
       }
    
    public int sumInt(int a,int b,int c)
    {
        return a+b+c;
    }
    
    public double sumDouble (double a ,double b, double c)
    {
        return a+b+c;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
      
        Sum s = new Sum();
       
        //Float
        float resultFloat = s.sumFloat(1.5f,2.5f,3.5f);        
        System.out.println("Result : " + resultFloat);
        
        //Integer
        int resultInt = s.sumInt(10, 20, 30);
        System.out.println("Result : " + resultInt);
        
        //Double
        double resultDouble = s.sumDouble(5, 10, 20);
        System.out.println("Result : " + resultDouble);
    }
    
}
