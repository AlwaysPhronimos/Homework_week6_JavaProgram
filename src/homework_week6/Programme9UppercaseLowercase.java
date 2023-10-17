package homework_week6;

import java.util.Scanner;

public class Programme9UppercaseLowercase
{
    //Programme to convert the uppercase to lower case
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence in Uppercase: ");
        String strUpper = sc.nextLine();
        String strLower = strUpper.toLowerCase();
        System.out.println("\nEquivalent Sentence in Lowercase = " + strLower);
        sc.close();
    }
}
