/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.set.pkg3;

/**
 *
 * @author Alaa-sw
 * 04.03.2018
 */
public class ProblemSet3 {

    /**
     * @param args the command line arguments
     */
    
    // Question 1 - السؤال الأول
    // In the function signature below, what is the return type?
    public float squareRoot(int x)
    {
         return x;
    } 
    
    // Question 2 - السؤال الثاني 
    /* Write the signature of a function called isPrime(). The access modifer should be public,
the return type should be boolean, and it should take a single integer parameter.*/
    
   public boolean isPrime(int n)
    {
       if (n>0){
         return true;
       }
       else 
       {
         return false;
       }       
    }
   
   // Question 3 - السؤال الثالث
   /*
   Which of the following function signatures has an error?
   */
   
//   A. public getAccountBalanace(long accountNumber) error
//   B. public void displayInTextBox(String string) richtig
//   C. public int roundToNearestInt(double x) richtig
//   D. public double getTemperature() richtig
   
   // Question 4 - السؤال الرابع
   
//   Write a Java function called absoluteValue(). The access modifer should be public, it
//should have a return type of double, and it should take one double parameter as input. If
//the double parameter is less than 0, it should return that number negated. Otherwise, it
//should return the parameter unchanged.
   
  public double absoluteValue(double d)
  {
     if (d<0)
     {
         return -d;
     }
     else 
     {
          return d;
     }
  }
  
  // Question 5 - السؤال الخامس
//  Write a Java function named calculateTip(). The access modifer should be public,
//it should have a return type of double, and it should take as input a double parameter
//representing the cost of a meal at a restaurant. And finally, it should return a double equal
//to 15% of the cost parameter.
  
  public double calculateTip(double cost){
      double tip = cost*0.15;
      return tip;
  }
  
  // Question 6 - السؤال السادس
  /*
  Write a Java function called nametagText(). The access modifer should be public, the
return type should be String, and it should take a String parameter called name. In the
body of the function, return the String \Hello, my name is " with the name parameter added
to the end. (Hint: use String concatenation.)
  */
  
  public String nametagText(String name) {
      String nametagText = "Hello, my name is " + name;
      return nametagText;
  }
  
  // Question 7 - السؤال السابع
  /*
  Define two functions. The first should be called fahrenheitToCelsius(). It should be
a public function with return type double that takes a double argument that represents a
temperature in Fahrenheit degrees. It should return the equivalent temperature in Celsius
degrees. (To convert from Fahrenheit to Celsius, use the formula C = (F - 32) * 5/9.)
Next, define a function called printTemperature(). It should be public, it should have a
return type of void, and it should take a double parameter that represents a temperature in
Fahrenheit degrees. This function should print \F: " followed by the Fahrenheit parameter,
then \C: " followed by the equivalent value in Celsius degrees. Use the first function you
defined to calculate the appropriate Celsius value inside the second function.
Bonus challenge: write javadoc comments for both functions.
  */
  
    public double fahrenheitToCelsius(double fahrenheit) {
          return (fahrenheit - 32) * 5 / 9;
    }
    
    public void printTemperature(double fahrenheit) {
             System.out.println("F: " + fahrenheit);
             System.out.println("C: " + fahrenheitToCelsius(fahrenheit));
    }
    
    // Question 8 - السؤال الثامن
    
    /*
    Define a function called monopolyRoll(). This function provides a random result based on
the dice-rolling rules for the board game Monopoly. In Monopoly, players roll two six-sided
dice to determine their move. If they roll the same value on both dice, this is called \rolling
doubles," and it means they go again. In our simplified version, the dice-roll function should
behave like this:
1. Generate two random integers in the 1 to 6 range.
2. If the numbers are not the same, return the sum.
3. If the numbers are the same, generate two more random integers in the 1 to 6 range,
and return the sum of all 4 numbers.
Hint: to make your code neater, you can define a second function that generates a random
integer in the 1 to 6 range (or in the 1 to x range based on a parameter) so that you do not
need to keep repeating that code.
    */
    
    public int diceRoll(int sides) {

       double randomNumber = Math.random() * sides;
              randomNumber = randomNumber + 1;
                return (int) randomNumber;
}
    
    public int monopolyRoll() {
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        System.out.println("roll1 = "+roll1);
        System.out.println("roll2 = "+roll2);
        int total = roll1 + roll2;
        if (roll1 == roll2) {
            int roll3 = diceRoll(6);
            int roll4 = diceRoll(6);
            System.out.println("roll3 = " + roll3);
            System.out.println("roll4 = " +roll4);
            total = total + roll3 + roll4;
        }
        return total;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // تنفيذ السؤال الأول
        ProblemSet3 s = new ProblemSet3();
        System.out.println(s.squareRoot(5));
        
        // تنفيذ السؤال التاني
        System.out.println(s.isPrime(6));
        
        // تنفيذ السؤال الرابع
        System.out.println(s.absoluteValue(5));
        
        // تنفيذ السؤال الخامس
        System.out.println(s.calculateTip(10));
        
        // تنفيذ السؤال السادس
        System.out.println(s.nametagText("Alaa-sw"));
        
        // تنفيذ السؤال السابع
        s.printTemperature(70);
        
        // تنفيذ السؤال الثامن
        System.out.println(s.monopolyRoll());
        
        
    }
    
}
