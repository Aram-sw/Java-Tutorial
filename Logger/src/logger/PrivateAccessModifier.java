/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

/**
 *
 * @author Alaa-sw
 * 10.03.2018
 */
public class PrivateAccessModifier {


    public static void main(String[] args) {
        String format ="PDF";
        Logger l= new Logger();
        l.setFormat(format);
        System.out.println(l.getFormat());
    }
    
}
