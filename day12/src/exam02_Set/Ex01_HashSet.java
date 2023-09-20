package exam02_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        System.out.println(names);
    }
}
