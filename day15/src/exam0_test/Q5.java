package exam0_test;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int result1 = exists(new String[] {"p","o","s"}, new String[]{"sod","eocd","qixm","adio","soo"});
        int result2 = exists(new String[] {"z","d","x"}, new String[]{"def","dww","dzx","loveaw"});
        int result3 = exists(new String[] {"s","o","m","d"}, new String[]{"moos","dzx","smm","adio","soo"});

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static int exists(String[] spell, String[] dic) {
        dic = Arrays.stream(dic).map(String::toUpperCase).toArray(String[]::new);
        for (String d: dic) {
            //d = d.toLowerCase();
            boolean match = true;
            for(String s: spell){
                if(d.indexOf(s.toUpperCase()) == -1) {
                    match = false;
                }
            }

            if(match) return 1;
        }
        return 2;
    }
}
