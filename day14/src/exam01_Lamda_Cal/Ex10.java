package exam01_Lamda_Cal;

import java.util.function.*;

public class Ex10 {
    public static void main(String[] args) {
        Consumer<String> func1 = System.out::println;   // s -> System.out.println(s)
        func1.accept("가나다");

        UnaryOperator<String> func2 = String::toUpperCase;
        System.out.println(func2.apply("abc"));

        BiPredicate<String, String> func3 = String::equals; //(s1, s2) -> s1.equals(s2);
        System.out.println(func3.test("가나다","가나다"));
    }
}
