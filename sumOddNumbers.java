// Home Work
// Question 2. Write a function to print the sum of all odd numbers from 1 to n;

import java.util.*;
public class sumOddNumbers {
    public static int printOddNumbers(int n){   //function decleration 
        int sum=0 ,i;
     for(i=1;i<=n;i++){
        if(i%2!=0){
          System.out.println("Odd Numbers:"+i);
          sum=sum+i;
        }
    }
    return sum;

} 
     public static void main(String args[]){ 
     //main function
      Scanner sc=new Scanner(System.in); //scanner class
       int n=sc.nextInt();
    //print and function calling
      System.out.print("Sum of Odd Numbers: "+printOddNumbers(n));
    }
}
