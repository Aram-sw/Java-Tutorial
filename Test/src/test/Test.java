/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package test;

/**
 *
 * @author Administrator
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ACTIVE
        System.out.println("User Status : " + UserStatus.ACTIVE);
        
        //whois.arin.net
        System.out.println("URL :" + WhoisRIR.ARIN.url());
        
        //PLUS
        double plus = Operation.PLUS.calculate(6, 8);
        System.out.println("PLUS :" + (int)plus);
        
        //MINUS
        double minus = Operation.MINUS.calculate(8,5);
        System.out.println("MINUS: " + (int)minus);
        
        //TIMES
        double times = Operation.TIMES.calculate(8,5);
        System.out.println("TIMES : " + (int)times);
        
        //DIVIDE
        double divide = Operation.DIVIDE.calculate(8,2);
        System.out.println("DIVIDE : " + (int)divide);
        
        
        // To loop a Enum object UserStatus.
        System.out.print("UserStatus : ");
        for (UserStatus status: UserStatus.values())
        {
            System.out.print(status + " ");
        }
        
        //To compare the Enum values, use == operator.
        WhoisRIR rir = WhoisRIR.APNIC;
        System.out.println();
        if (rir==WhoisRIR.APNIC)
        {
            System.out.println("This is APNIC " + rir.url());
        }
        //Switch case.
        switch (rir) {
            case ARIN:
                System.out.println("This is ARIN");
                break;
            case APNIC:
                System.out.println("This is APNIC");
                break;
            case RIPE:
                System.out.println("This is RIPE");
                break;
            default:
                throw new AssertionError("Unknown RIR " + rir);
        }
        
        // Convert a String to Enum object.
        //enum valueOf + uppercase
        Operation op = Operation.valueOf("times".toUpperCase());
        System.out.println(op.calculate(10, 3));

    }
    
}
