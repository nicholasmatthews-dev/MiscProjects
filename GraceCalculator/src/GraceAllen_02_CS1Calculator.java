/*
  Program Name: GraceAllen_02_CS1Calculator
   
  Description: This program acts as a simple calculator. It prompts the user 
  for the type of problem; addition, subtraction, multiplication, or 
  division. The user is then prompted for 2 integers, then the program performs the
  calculation and returns the answer.
   
  Author: Grace Allen
  Date: October 14, 2020
  Version: 01
   
  Vocabulary word: Serendipity (noun)-the occurrence and development of events 
                   by chance in a happy or beneficial way.
   
  Inspirational quote: “The best way to step beyond weakness is to embrace it."
                       Dr. Abhijit Naskar, Neuroscientist
                       
*/

import java.util.Scanner;

public class GraceAllen_02_CS1Calculator {

   public static void main (String [] args)  {
      int num1;
      int num2;
      int addProbs = 0;
      int subProbs = 0;
      int mulProbs = 0;
      int divProbs = 0;
      char op;

      
      Scanner reader = new Scanner(System.in);
      System.out.println("Select the type you would like to calculate by " +
                         "entering the first letter of operation.");
      System.out.println("(A)dd");
      System.out.println("(S)ubtract");
      System.out.println("(M)ultiply");
      System.out.println("(D)ivide");
      System.out.println( );
      System.out.println("(E)xit");
      System.out.println( );
      
      while (true){
      
      System.out.print("Operation? ");
      op = reader.next().charAt(0);
      
      System.out.println();
      
      if (op == ('A')|| op == ('a'))
      {
      System.out.println("You selected addition.");
      addProbs += 1;
      }
      
      if (op ==('S')|| op == ('s'))
      {
      System.out.println("You selected subtraction.");
      subProbs += 1;
      }
      
      if (op == ('M')|| op == ('m'))
      {
      System.out.println("You selected multiplication.");
      mulProbs += 1;
      }
      
      if (op == ('D')|| op == ('d'))
      {
      System.out.println("You selected division.");
      divProbs += 1;
      }
      
      if (op == ('E')|| op== ('e'))
      {
      System.out.println("You selected exit.");
      break;
      }
      
      System.out.print("Enter your first number: ");
      num1 = reader.nextInt();
      
      System.out.print("Enter your second number: ");
      num2 = reader.nextInt();
      
      if (op == ('A')|| op == ('a'))
      {
      System.out.println("The answer is " + (num1 + num2) + ".");
      }
      
      if (op ==('S')|| op == ('s'))
      {
      System.out.println("The answer is " + (num1 - num2) + ".");
      }
      
      if (op == ('M')|| op == ('m'))
      {
      System.out.println("The answer is " + (num1 * num2) + ".");
      }
      
      if (op == ('D')|| op == ('d'))
      {
      System.out.println("The answer is " + (num1 / num2) + ".");
      }
      System.out.println();
      }
      
    System.out.println();  
    System.out.println("Calculator Report");
	System.out.println("Addition problems: " + addProbs);
	System.out.println("Subtraction problems: " + subProbs);
	System.out.println("Multiplication problems: " + mulProbs);
	System.out.println("Division problems: " + divProbs);
	System.out.println("Total problems: " + (addProbs + subProbs + mulProbs + divProbs));
    }
   
}                                            