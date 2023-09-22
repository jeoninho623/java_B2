package exam01_Lamda_Cal;

import java.util.function.Supplier;

public class Ex02 {
    public static void main(String[] args) {
        int c = 30;
        Calculator cal = (a, b) -> {
            return a + b + c;
        };

        int result = cal.add(10,20);
        System.out.println(result);
    }
}
