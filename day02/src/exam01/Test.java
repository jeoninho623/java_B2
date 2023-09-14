package exam01;

public class Test {
    public static void main(String[] args) {
        int num1 = 8;
        double num2 = 3.6;

        int result2 = (int)(num1 * num2);
        System.out.println(result2);

        int result = num1 * (int)num2;
        System.out.println(result);
    }
}
