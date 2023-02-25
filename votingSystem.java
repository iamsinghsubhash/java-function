// Home Work
// Question 5. Write a function that takes in age as input and returns if that person to vote or not. A person of age > 18 is eligible to vote;

import java.util.*;
public class votingSystem{
  public static boolean isEligible(int age){
    if(age>18){
      return true;
    }
    else{
      return false;
    }
}
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int age = sc.nextInt();
    System.out.println(isEligible(age));
  
  }
}



