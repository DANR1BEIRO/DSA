package Recursion;

public class Recursion {
    public static String A(){
        return "Hello " + B();
    }

    public static String B(){
        return "my " + C();
    }

    public static String C(){
        return "friend!";
    }
    public static void main(String[] args) {
        System.out.println(A());

    }
}
