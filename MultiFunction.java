// Question 3.MAke a function to Multiply 2 numbers and return the Product. 

import java.util.*;
public class MultiFunction {
    public static int MultiTwoNumbers(int a, int b){
     return a*b;
    }
     public static void main(String args[]){
      Scanner sc=new Scanner(System.in); //scanner class
      System.out.println("Enter the value of a:");
      int a=sc.nextInt();
      System.out.println("Enter the value of b:");
      int b=sc.nextInt();
   //function calling and printing
      System.out.println("Product of two numbers is:" +MultiTwoNumbers(a,b));
    }
}
