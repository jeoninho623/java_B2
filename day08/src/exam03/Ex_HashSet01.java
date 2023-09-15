package exam03;

import java.util.HashSet;

public class Ex_HashSet01 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        String name1 = "이름1";
        String name2 = new String("이름1");
        System.out.println("name1.hashcode() :" + name1.hashCode());
        System.out.println("name2.hashcode() :" + name2.hashCode());

        names.add(name1);
        names.add(name2);
        names.add("이름2");
        names.add(new String("이름2"));
        names.add("이름3");

        System.out.println(names);
    }
}
