package exam01_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        LinkedList<String> names2 = new LinkedList<>(names);


        /*for(int i = 0; i < names.size(); i++) {
            names.remove(i);
        }*/

        /*for(int i = names.size() -1; i >= 0; i--) {
            names.remove(i);
        }*/

        for(int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        }
    }
}
