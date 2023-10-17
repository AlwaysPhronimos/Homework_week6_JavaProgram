package homework_week6;

import java.util.Scanner;

//Write a Java program to convert a given string into lowercase.
public class Programme19LowercaseUppercase
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Sentence in Lowercase: ");
        String strLower = scan.nextLine();
        String strUpper = strLower.toUpperCase();
        System.out.println("\nEquivalent Sentence in Uppercase = " + strUpper );
        scan.close();
    }

}
