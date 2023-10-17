package homework_week6;

import java.util.Scanner;

public class Programme16BinaryNumbers
    //Write a Java program to add two binary numbers.
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the first Binary number: ");
        String binary1 = scan.next();
        System.out.println("Enter the second Binary number: ");
        String binary2 = scan.next();
        int b1 = Integer.parseInt(binary1,2);
        int b2 = Integer.parseInt(binary2,2);

        int sum = b1+b2;
        System.out.println("\n Sum of two binary numbers : ");
        System.out.println(Integer.toBinaryString(sum));
        scan.close();
    }
}
