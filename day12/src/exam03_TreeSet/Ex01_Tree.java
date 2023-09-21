package exam03_TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01_Tree {
    public static void main(String[] args) {

        /*Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Set<String> names = new TreeSet<>(comp);*/
        Set<String> names = new TreeSet<>(Comparator.reverseOrder());
        names.add("이름2");
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름5");
        names.add("이름4");

        System.out.println(names);
    }
}