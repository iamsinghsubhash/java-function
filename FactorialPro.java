// Question 4. Find the factorial of a number.

import java.util.*;
public class FactorialPro {
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return; 
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
            System.out.println(factorial);
     return;
    }
     public static void main(String args[]){
      Scanner sc=new Scanner(System.in); //scanner class
      System.out.println("Enter the value of n:");
      int n=sc.nextInt();
      printFactorial(n);
    }
}
