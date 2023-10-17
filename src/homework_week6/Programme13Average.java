package homework_week6;

import java.util.Scanner;

public class Programme13Average
{
    //Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double y = scan.nextDouble();
        System.out.print("Enter the third number: ");
        double z = scan.nextDouble();
        System.out.print("The average value is " + average(x,y,z) + "\n");
        scan.close();
    }
    public static double average(double x, double y, double z)
    {
        return (x+y+z) / 3;
    }

}
