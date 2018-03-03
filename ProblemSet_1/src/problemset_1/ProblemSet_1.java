/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemset_1;

/**
 *
 * @author Administrator
 */
public class ProblemSet_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         // Question 1 - السؤال الأول
         int x = 5;
         double temperature = 75.6;
         char grade = 'A';
         String name = "Alaa";
         
          // String name = 'Alaa';  error 
         /*
           When defining Strings, we need to use double quotes around the text, like this:
           String name = "Adam";
           Single quotes are used for defining single characters, like this:
           char grade = ’A’;3
         */
         System.out.println("X: " + x);
         System.out.println("Temperature : " + temperature);
         System.out.println("Name : " + name);
         //--------------------------------------------------
         
         // Question 2 - السؤال الثاني
         double register = 10.0;
         register = register + 5; //Customer pays $5.
         register = register - 2.5; //Customer receives $2.50 as change.
         register = register +10; //Customer pays $10.
         register = register - 3; //Customer receives $3 as change.
         System.out.println("Register :" + register);
         
         /*
          Question 3 - المثال الثالث
          Define an integer variable called bankBalance.
          Initialize it to a value of 500.
          Then add 250to it.
          Then subtract 100 from it.
          Finally, print the resulting value.6
         */
         int bankBalance = 500;
         bankBalance = bankBalance + 250;
         bankBalance = bankBalance - 100;
         System.out.println("Result : " + bankBalance);
         
         // Question 4 - المثال الرابع
         /*
         What value will be printed by this line of Java code?
         */
         System.out.println("Value : " + 2.0*(5 / 2));
         
         /*
         When evaluating the arithmetic expression2.0*(5 / 2), Java will evaluate the expres-sion inside the parentheses,5 / 2.
         When dividing two integers, Java will take ignore theremainder, so5 / 2evaluates to the integer 2, not the double 2.5.
         This process is calledtruncation.
         The  second  step  in  evaluating  the  expression  is  evaluating2.0*2.
         Whenmultiplying a double and an integer, the result is a double, so the value printed is the double 4.0
         */
         
         //Question 5 - السؤال الخامس
         /*
          Write Java code to define an integer variable calledday, and a String variable calledmonth.
          Give month and day appropriate values for your birthday.10
         */
         /*
         int day;
         String month;
         day = 17;
         month = "Mai";
          */
        //Note that this can be compressed into two lines by defining the
       //variables and giving them an initial value at the same time:
       
       int day = 17;
       String month = "Mai";
       
       // Question 6 - المثال السادس
       /*
         Write Java code to create a String variable called firstName, define it to be your first name
         as a String.
         Then define a variable called lastName and define it to be your last name as a
         String.
         Then define a variable called fullName and set it to be your firrst name followed by
         a space followed by your last name.
         Use the existing variables for your rst and last name
         and String concatenation to dene fullName.
         Finally, write code to print this text:
       
         Hello, my name is [full name].
         There are [number] letters in my name.
       
         Use String concatenation to create the rst String to print using the fullName variable, and
         use the .length() command on rstName and lastName to calculate the number of letters.
         Note: you can concatenate an integer and a String and the integer will be converted to a
         String.
         For example, this expression:
         "There are "+ 7 + "days in a week."
          will be evaluated as the String:
          "There are 7 days in a week."
          
       */
       
       String firstName = "Alaa";
       String lastName = "Alswedan";
       String fullName = firstName + " " + lastName;
       
       System.out.println("Hello, my name is " + fullName + ".");
       int lettersInName = firstName.length() + lastName.length();
       System.out.println("There are " + lettersInName + " letters in my name.");
       
       // Question 7 - المثال السابع
       /*
       Write Java code to dene a double variable called fahrenheit and set it to an initial value
       between 0 and 100.
       Then, create a double variable called celsius, and calculate its value
       based on the value of fahrenheit.
       (To convert from Fahrenheit to Celsius, subtract 32,
         then multiply by 5, then divide by 9.) Finally, print the final value of celsius.
       */
       
       double fahrenheit = 68.0;
       double celsius; 
       celsius =(fahrenheit-32)*5/9;
       System.out.println("Celsius " + celsius);
       //With fahrenheit having a value of 68.0, this would print 20.0.
             
         
    }

}