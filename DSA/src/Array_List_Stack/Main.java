package Array_List_Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------Array-----------");
        String[] sannin = new String[3];
        sannin[0] = "Jyraya";
        sannin[1] = "Orochimaru";
        sannin[2] = "Tsunade";

        for (String ninja : sannin) {
            System.out.println(ninja);
        }

        System.out.println("------------List------------");
        List<String> jounin = new ArrayList<>();
        jounin.add("Kakashi");
        jounin.add("Gai");
        jounin.add("Asuma");

        System.out.println(jounin);
        for (String s : jounin) {
            System.out.println(s);
        }
        System.out.println("-----------Stack-----------");
        Stack<String> genin = new Stack<>();
        genin.push("Neji");
        genin.push("Gaara");
        genin.push("Rock Lee");
        genin.push("Kankuro");

        System.out.println(genin);

        while (true) {
            try {
                System.out.println("First stack element: " + genin.peek());
                System.out.println("Genin removed: " + genin.pop());
            } catch (EmptyStackException e) {
                System.out.println("Stack is empty");
                break;
            }
        }
    }
}
