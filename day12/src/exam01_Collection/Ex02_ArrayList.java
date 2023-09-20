package exam01_Collection;

import java.util.Vector;

public class Ex02_ArrayList {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>(3);
        System.out.println("capacity : " + names.capacity());
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        System.out.println("capacity : " + names.capacity());
    }
}
