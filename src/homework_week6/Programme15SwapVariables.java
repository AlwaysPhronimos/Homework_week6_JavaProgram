package homework_week6;

import java.util.Scanner;

public class Programme15SwapVariables
{
    //Write a Java program to swap two variables.
    public static void main(String[] args) {
        int x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        x = in.nextInt();
        System.out.println("Enter the second Number: ");
        y = in.nextInt();
        z=x;
        x=y;
        y=z;
        System.out.println("Swap variables are: " +x + " and "+ y);
        in.close();
    }
}
