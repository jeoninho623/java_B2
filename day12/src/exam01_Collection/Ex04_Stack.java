package exam01_Collection;

import java.util.Stack;

public class Ex04_Stack {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");

        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
    }
}
