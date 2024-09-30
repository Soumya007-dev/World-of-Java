
import java.util.Scanner;

public class homework1 {

  public static void main (String args[]){
    System.out.println("the report card of a student studying in cbse board");
    Scanner s=new Scanner (System.in);
    System.out.println("Marks of first subject:");
    float a=s.nextFloat();
    System.out.println("Marks of second subject:");
    float b=s.nextFloat();
    System.out.println("Marks of third subject:");
    float c=s.nextFloat();
    System.out.println("Marks of fourth subject:");
    float d=s.nextFloat();

    System.out.println("Marks of fifth subject:");
    float e=s.nextFloat();
System.out.println("Total percentage:");


 float x=(a+b+c+d+e)/5;
System.out.println(x);



  }



}
