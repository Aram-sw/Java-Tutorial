/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.set.pkg4;

/**
 *
 * @author Alaa-sw
 * 08.03.2018
 */
public class ProblemSet4 {


    // تابع عودي لحساب العاملي 
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
    
    // تابع نظامي لحساب العاملي
    public static int factorialNormal(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    
    // تابع للبحث عن كلمة في مصفوفة من الكلمات
    public static int indexOfFirstOccurrence(String[] stringArray, String target) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }


    // حساب عدد السنوات المطلوبة للحصول على مبلغ مليون يورو
    public static int yearsTilOneMillion(double initialBalance) {
        int years = 0;
        double balance = initialBalance;
        while (balance < 1000000) {
            years++;
            balance = balance * 1.05;
        }
        return years;
    }
    
    // طباعة عناصر مصفوفة بالعكس الطريقة الأولى
    public static void printInVerverse(String[] weekdays)
    {
       for (int i=weekdays.length-1; i>=0; i--)           
       {
           System.out.print(weekdays[i]+ " ") ;
       }
        System.out.println();
    }
    
    // طباعة عناصر مصفوفة بالعكس الطريقة الثانية
    public static void printVerverse(String[] stringArray)
    {
        
        for (int i = 0; i < stringArray.length; i++) {
            
           int indexToPrint = stringArray.length - 1 - i;
           System.out.print(stringArray[indexToPrint]+ " ");
        }
        System.out.println();
    }
            
    
    // ايجاد البعد بين قيمتين كبرى وصغرى في عناصر مصفوفة
    public static int findRange(int[] intArray) {
        if (intArray.length == 0) {
            return -1;
        }
        int smallest = intArray[0];
        int largest = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < smallest) {
                smallest = intArray[i];
            }
            if (intArray[i] > largest) {
                largest = intArray[i];
            }
        }
        return largest - smallest;
    }
            
    
    public static void main(String[] args) {
        
        // Question 1 - السؤال الأول
       // What will be printed by this block of Java code?  
       int n=10;
       while (n<50)
       {
         n = n*2;
       }
       System.out.println(n);
       
       
        // Question 2 - السؤال الثاني
        /*
        Complete the factorial()function below.  It should return the product of all the numbers from 1 to the parametern.  For example,factorial(5)should return 120 because 1 x 2 x3 x 4 x 5 = 120.  Think about what kind of loop you want to use to accomplish this.
        */
        int number = 5;//It is the number to calculate factorial    
        System.out.println("Factorial of " + number + " is: " + factorialNormal(number));
        // استدعاء التابع العودي لطباعة العاملي
        System.out.println("Factorial of " + number + " is: " + factorial(number));
        
        
        // Question 3 - السؤال الثالث
        /*
        Complete  the  code  in  this  function  to  find  and  return  the  lowest  index  in  the  String  array stringArray that  the  String  target  occurs.
        If  the  String target does  not  occur  in stringArray, -1 should be returned.
        Starting code:
        public int indexOfFirstOccurrence(String[] stringArray, String target){return -1;}
        As an example of how this function should work, this code should print 1, because the word“Java” appears at index 1.
        String[] sentence = {"Learning", "Java", "is", "fun."};
        int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
        System.out.println(indexOfWordJava);
        Hint:   you  cannot  compare  two  Strings  using  the==operator!
        This  will  be  false  unless the  two  Strings  are  actually  the  same  String  object,  not  just  two  Strings  with  the  same letters.
        To  check  whether  two  Strings  have  the  same  letters,  use  the equals() method: if (myString1.equals(myString2)).
        */

        String[] sentence = {"Alaa","Dalal","Alswedan","Jabri"};
        String target= "Jabri";
        int indexOfTarget = indexOfFirstOccurrence(sentence, target);
        System.out.println(indexOfTarget);
        
        // Question 4 - السؤال الرابع
        /*
        A savings account yields 5% interest annually.
        This Java function is designed to determine how many years it will take for you to have $1,000,000 on deposit given an initial value.
        Theparameter represents the initial deposit, and the function should return an integer numberof years before there will be $1,000,000 or more in the account.
        Write a loop to determinethe number of years, and return that value.
       (Hint:  Do we know how many times this loop needs to iterate?
        Does this mean a for loopor a while loop is more appropriate?)
        Starting code:public int yearsTilOneMillion(double initialBalance) {return 0;}

        */
        
        System.out.println(yearsTilOneMillion(1000));
        
       // Question 5 - السؤال الخامس
       /*
       Complete the Java function below to print out all the Strings in the String array parameter
       in reverse order.
      (The String at the highest index should be printed first, then the String at
       the next highest index, and so on.
       The String at index 0 should be printed last.)
       For example, if a String array called weekdays had value
         {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}
            then this function call:
          printInVerverse(weekdays);
would print:
Friday
Thursday
Wednesday
Tuesday
Monday
       */
        
       // تنفيذ استدعاء الطريقة الأولى لطباعة عناصر المصفوفة بالعكس
       String[] weekDayes = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
       printInVerverse(weekDayes);
      // تنفيذ استدعاء الطريقة الثانية لطباعة عناصر المصفوفة بالعكس
       printVerverse(weekDayes);
       
       
       // Question 6 - السؤال السادس
       /*
       Complete the function below, which nds the range covered by an integer array. Inside
the function, nd the smallest value in the parameter array, and nd the largest value, and
return the largest value minus the smallest value. If the array has length 0, return -1.
For example, if the variable myIntArray had the value
{1, 0, 2, 3, -1, 2}
then the function call
findRange(myIntArray)
would return 4. The largest value in the array is 3, the smallest value is -1, and 3􀀀(􀀀1) = 4.
Starting code:
public int findRange(int[] intArray) {
return -1;
}
       */
       
       // تنفيذ التابع لحساب المسافة بين قيمتين
       int[] intArray = {1,0,2,3,-1,2};
       System.out.println(findRange(intArray));
       
       // Question 7 - السؤال السابع
        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            String thisRow = "";
            for (int j = 0; j < i; j++) {
                thisRow = thisRow + "#";
            }
            System.out.println(thisRow);
        }
       
        

    }
 
}
