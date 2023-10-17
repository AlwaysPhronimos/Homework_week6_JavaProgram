package homework_week6;

import java.util.Scanner;

public class Programme8TriangleArea
{
    /** program to calculate area of Triangle with user interaction.
     * Program will prompt user to enter the base width and height of the triangle.
     */
    public static void main (String [] args) //main method
    {
        Scanner scanner = new Scanner(System.in); //
        System.out.println("Enter the width of the Triangle: "); // print statement to ask user for width
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the Triangle: ");// print statement to ask user for height
        double height = scanner.nextDouble();
        double area = (base * height)/2; //Area = ((width*height)/2) formula to measure area
        System.out.println ("Area of Triangle is: " + area);
        scanner.close();
    }
}
