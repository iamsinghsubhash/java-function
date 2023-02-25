// Home Work
// Question 1. Enetr 3 Numbers from the user & make a function their avarage;

import java.util.*;
public class AvaragePro {
    public static int printavarage(int a ,int b, int c){   //function decleration 
     return (a+b+c)/3;
    }
     public static void main(String args[]){  //main function
      Scanner sc=new Scanner(System.in); //scanner class
      System.out.println("Enter the 3 Numbers:");
      System.out.println("Enter the value of a:");
      int a=sc.nextInt();
      System.out.println("Enter the value of a:");
      int b=sc.nextInt();
      System.out.println("Enter the value of a:");
      int c=sc.nextInt();
      System.out.println("Average of 3 numbers:"+printavarage(a,b,c)); //print and function calling
    }
}
