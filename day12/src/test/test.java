package test;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static int checkWordExistence(List<Character> spell, List<String> dic) {
        for (String word : dic) {
            List<Character> remainingSpell = new ArrayList<>(spell);
            boolean isValidWord = true;

            for (char c : word.toCharArray()) {
                if (remainingSpell.contains(c)) {
                    remainingSpell.remove(remainingSpell.indexOf(c));
                } else {
                    isValidWord = false;
                    break;
                }
            }

            if (isValidWord && remainingSpell.isEmpty()) {
                System.out.println("spell: " + spell);
                System.out.println("dic: " + dic);
                System.out.println("Result: " + word);
                return 1; // 모든 문자가 사용되었으며, 주어진 spell로 만들 수 있는 단어가 dic에 존재
            }
        }

        System.out.println("spell: " + spell);
        System.out.println("dic: " + dic);
        System.out.println("Result: None");
        return 2; // 주어진 spell로 만들 수 있는 단어가 dic에 존재하지 않음
    }

    public static void main(String[] args) {
        List<Character> spell1 = List.of('p', 'o', 's');
        List<String> dic1 = List.of("sod", "eocd", "qixm", "adio", "soo");
        System.out.println(checkWordExistence(spell1, dic1)); // 2

        List<Character> spell2 = List.of('z', 'd', 'x');
        List<String> dic2 = List.of("def", "dww", "dzx", "loveaw");
        System.out.println(checkWordExistence(spell2, dic2)); // 1

        List<Character> spell3 = List.of('s', 'o', 'm', 'd');
        List<String> dic3 = List.of("moos", "dzx", "smm", "sunmmo", "som");
        System.out.println(checkWordExistence(spell3, dic3)); // 2
    }
}
