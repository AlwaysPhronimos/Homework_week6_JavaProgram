package homework_week6;

import java.util.Scanner;

public class Programme7ConvertTempFC
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit:  ");
        double fahrenheit = scanner.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " Fahrenheit = Celsius = " + celsius);
        scanner.close();
    }
}
