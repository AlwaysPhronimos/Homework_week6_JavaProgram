package homework_week6;

import java.util.Scanner;

public class Programme14PerimeterRectangle
{
    //Write a Java program to print the area and perimeter of a rectangle.

    public static void main(String[] args)
    {
        double w, h, p;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectengle: ");
        w = scan.nextDouble();
        System.out.println("Enter the Width of the Rectengle: ");
        h = scan.nextDouble();
        p = w*h;
        System.out.println("Perimeter of the Rectengle is : " + p );
        scan.close();
    }

}
