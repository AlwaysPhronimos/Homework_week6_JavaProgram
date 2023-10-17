package homework_week6;

//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
public class Programme18
{
    public static void main(String[] args)
    {
        sum(); // call static method in main method
    }

    static void sum() //static method
    {
    int a = 125;
    int b = 24;
    int add = a+b;
    int multiply = a*b;
    int sub = a-b;
    int divide = a/b;
            System.out.println(a + " + " + b +" = " + add);
            System.out.println(a + " + " + b +" = " + sub);
            System.out.println(a + " + " + b +" = " + multiply);
            System.out.println(a + " + " + b +" = " + divide);
    }
}







