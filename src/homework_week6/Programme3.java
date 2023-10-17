package homework_week6;

public class Programme3 {
    int a = 10;  //instance variable
    static int b = 20; //static variable
    void printInt()  //instance method
    {
        System.out.println("Instance Variable: " + a); // print instance and static
        System.out.println("Static Variable: " + b);
    }
    static void printStatic() //static method
    {
        Programme3 t1 = new Programme3(); // print instance and static
        System.out.println("Instance Variable: " + t1.a );
        System.out.println("Static Variable: " + b );
    }
    public static void main(String[] args) //main method Call both instance and static methods
    {
        Programme3 t = new Programme3();
        t.printInt();
        printStatic();
    }

}
