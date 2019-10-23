
package pkgif.pkgelse.statements;

// Import Scanner Here
import java.util.Scanner;


/**
 *
 * Name:Peter Aller
 * Period:7
 * Project Name:If-Else-Statements
 * 
 * 
 */
public class IfElseStatements {

    // Create Scanner Object here So it may be used in all methods
    private static Scanner kb = new Scanner(System.in); 
    
    
    public static void main(String[] args) {
        // Happy Coding!
        
        
        //Invoke the methods here 
        
//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
//        question7();
//        question8();
        question9();
        question10();
         }
    public static void question1(){
        
       System.out.println("What is your grade? ");
       int value1 = kb.nextInt(); 
       
       if(value1 >= 70)
           
       {
          System.out.println("Passing");
       } 
       else
       {
           System.out.println("NOT PASSING");
       }
    }
    
    public static void question2(){
        System.out.println("Give me a number ");
        int value2 = kb.nextInt();
        
        if(value2 <= 50)
        {
            System.out.println("Go");
        }   
        else
        {
            System.out.println("Stop"); 
        }
        
    }
    
    public static void question3(){
        
        System.out.println("Give me a number ");
        int value3 = kb.nextInt();
        
        if(value3%2 == 0 )
        {
            System.out.println("Even");
        }   
        else
        {
           System.out.println("Odd"); 
        }
      }
    
    public static void question4(){
        
       System.out.println("Give me a number");
       int value4 = kb.nextInt();
        
        if(value4%5 == 0)
        {
            System.out.println("Multiple of 5");
        }   
        else 
        {
            System.out.println("Not a multiple of 5");
        }   
        
    }
    
    public static void question5(){
        System.out.println("Give me a number");
        int value5 = kb.nextInt();
        
        if(value5 < 10)
        {
            System.out.println("ONE DIGIT");
        }
        else if(value5 >= 100)
        {
            System.out.println("THREE DIGITS");
        }
        
        else if(value5 >= 10)
        {
            System.out.println("TWO DIGITS");
        }
            
     }
    
    public static void question6(){
       System.out.println("What is the jersey number");
       int value6 = kb.nextInt();
       
       if(value6 == 12)
       {
           System.out.println("That number is retired from the Seattle Seahawks");
       }
       else if(value6 == 71)
       {
          System.out.println("That number is retired from the Seattle Seahawks"); 
       }   
       
       else if(value6 == 80)
       {
           System.out.println("That number is retired from the Seattle Seahawks");
       }
    }
    
    public static void question7(){
       System.out.println("Where are you from? ");
       kb.nextLine();
       String value7 = kb.nextLine(); 
       
       if(value7.equals ("Washington"))
       {
          System.out.println("This state is in the PNW"); 
       }
       else if(value7.equals ("Oregon"))
       {
           System.out.println("This state is in the PNW");
       }
       
       else if(value7.equals ("Idaho"))
       {
           System.out.println("This state is in the PNW");
       }
       else
       {
           System.out.println("You should move to the PNW; it's great here!");
       }
    
   }
    
    
    
    public static void question8(){
        
        System.out.println("Which size do you want");
        
        String value8 = kb.nextLine();
        
       if(value8.equals ("SHORT"))
       {
           System.out.println("That has 8oz");
       }
       else if(value8.equals ("TALL"))
        {
           System.out.println("That has 12oz");
        }       
       else if(value8.equals ("GRANDE"))
       {
           System.out.println("That has 16oz");
        }
       else if(value8.equals ("VENTI"))
       {
           System.out.println("That has 20oz");
       }
          }
    
    public static void question9(){
       System.out.println("How much do you get paid? ");
       int value9 = kb.nextInt(); 
       System.out.println("How many hours do you work");
       int hour1 = kb.nextInt();
        
        
        
    }
    
    public static void question10(){
        
    }
    
}
