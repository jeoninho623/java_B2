package exam01_Lamda_Cal;

import java.util.function.BinaryOperator;

public class Ex04 {
    public static void main(String[] args) {
        BinaryOperator<Integer> cal = (a, b) -> a + b;
        int result = cal.apply(10,20);  // a.intValue() + b.intValue()
        System.out.println(result);
    }
}
