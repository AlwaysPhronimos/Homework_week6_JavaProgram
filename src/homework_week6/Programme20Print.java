package homework_week6;
//Write a Java Program to print as below.
public class Programme20Print
{
    void print() // create instance method
    {
        System.out.println("\"+------------------------+\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|      CORNER STORE      |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| 2015-03-29 04:38PM     |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Gallons:      10.870   |\"");
        System.out.println("\"| Price/gallon:$ 2.089   |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Fuel total: $ 22.71    |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"+------------------------+\"");
    }
    public static void main(String[] args) // create main method
    {
        Programme20Print t1 = new Programme20Print(); //declare instance method
        t1.print(); //call instance method into main method
    }
}
