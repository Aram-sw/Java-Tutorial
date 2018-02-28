/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Alaa-sw
 */
public class Singleton {
    private static  Singleton singleton = new Singleton( );

/* A private Constructor prevents any other

* class from instantiating.

*/

private Singleton() { }

/* Static 'instance' method */

public static Singleton getInstance( ) {

return singleton;

}

/* Other methods protected by singleton-ness */

protected static void demoMethod( ) {

System.out.println("demoMethod for singleton");

}
    
}
