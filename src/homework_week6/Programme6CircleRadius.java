package homework_week6;

import java.util.Scanner;

public class Programme6CircleRadius
    // Program to find radius of circle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
        sc.close();
    }

}
