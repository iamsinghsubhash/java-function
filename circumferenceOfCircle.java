// Home Work
// Question 3. Write a function that takes in the radius as input and return the circumference of a circle.

//we know that circumference of a circle=2pir.

import java.util.*;
public class circumferenceOfCircle{
  public static Double getCircumference(Double radius){
    return 2*3.14*radius;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Double radius=sc.nextDouble();
    System.out.println(getCircumference(radius));
  }
}


