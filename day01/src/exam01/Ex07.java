package exam01;

public class Ex07 {
    public static void main(String[] args) {
        // 0 ~ 1
        long num = 10000000000L;
        double num2 = num;
        float num3 = num;

        // int num4 = num;

        byte num4 = 100;
        int num5 = 200;
        int result = num4 + num5;       // byte -> int
        System.out.println(result);
    }
}
