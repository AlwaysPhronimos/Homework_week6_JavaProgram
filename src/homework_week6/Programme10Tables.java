package homework_week6;

import java.util.Scanner;

public class Programme10Tables
{
    public static void main(String[] args)
    {
        //number n for which we have to print the
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: "); // reading a number for table is to be print
        int num = sc.nextInt(); //loop start execution
        System.out.println("Multiplication table for " + num + ":");

        for ( int i=1; i<=10; i++)
        {
            System.out.println(num+" * "+ i +" = "+num*i); //prints table of the entered number
            sc.close();
        }

    }
}
