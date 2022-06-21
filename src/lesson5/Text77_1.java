package lesson5;

import java.util.Scanner;

public class Text77_1 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();

    System.out.println("Enter point 2 (latitude and longitude) in degrees:  ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();




    double x1Radian = Math.toRadians(x1);
    double y1Radian = Math.toRadians(y1);
    double x2Radian = Math.toRadians(x2);
    double y2Radian = Math.toRadians(y2);

    double greatDistance = 6371.01 * Math.acos(Math.sin(x1Radian) * Math.sin(x2Radian)
        + Math.cos(x1Radian) * Math.cos(x2Radian) * Math.cos(y1Radian - y2Radian));
    System.out.println("The distance between the two points is " + greatDistance + "km");
    

    input.close();
  }

}
