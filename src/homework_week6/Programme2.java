package homework_week6;

public class Programme2 {
    //declare two static method
    static int v = 15;
    static String name = "Java";

    public static void printStatic() {
        System.out.println(v);
        System.out.println(name);
    }
    //declare main method
    public static void main(String[] args) {

        {
            printStatic();
        }
    }

}

