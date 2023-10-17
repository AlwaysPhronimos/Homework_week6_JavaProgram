package homework_week6;

public class Programme4

{
    int a = 10; //instance variables
    int b = 20; //instance variables
    static String name = "Java"; //static variables
    static String learn = "Programming"; //static variables
    void method1() // instance method
    {
        System.out.println(a); // print instance variable
        System.out.println(b); // print instance variable
        System.out.println(name); //print static variable
        System.out.println(learn); //print static variable
    }
    static void method() // static method
    {
        Programme4 t1 = new Programme4();
        System.out.println(t1.a); //print instance variable
        System.out.println(t1.b); //print instance variable
        System.out.println(name); //print static variable
        System.out.println(learn); //print static variable
    }
    public static void main(String [] args) // main method
    {
        Programme4 t2 = new Programme4(); // created object to call instance method
        t2.method1(); // call instance
        method(); // call static
    }
}
