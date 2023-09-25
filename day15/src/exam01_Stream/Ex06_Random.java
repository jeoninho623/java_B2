package exam01_Stream;

import java.util.Random;

public class Ex06_Random {
    public static void main(String[] args) {
        (new Random()).ints().limit(10).sorted().forEach(System.out::println);
    }
}
