package exam02;

public class Ex_Function01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = add(num1, num2);
        System.out.printf("값은 : %d%n",result);
    }

    static int add(int num1, int num2) {
        //함수 지역
        int result = num1 + num2;

        return result;
    }
}