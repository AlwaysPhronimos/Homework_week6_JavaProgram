package homework_week6;

import java.util.Scanner;

public class Programme17DecimalBinary
    //Write a Java program to convert a decimal number to binary number.
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number");

        int decimal = sc.nextInt();
        int bin[] = new int[100];
        int i = 0;
        while (decimal > 0)
        {
            bin[i++] = decimal % 2;
            decimal = decimal / 2;
        }
        System.out.print("Binary number is : ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin[j]);
            sc.close();
        }
    }
}

