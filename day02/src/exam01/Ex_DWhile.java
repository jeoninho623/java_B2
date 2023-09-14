package exam01;

public class Ex_DWhile {
    public static void main(String[] args) {
        int num = 1, total = 0;

        do {
            total += num;
            num++;
        } while (num < 1);

        System.out.println(total);

        // 초기값 ( int num = 1 ), 조건식 ( num <= 100 ), 증감식 ( num++ ) -> 횟수에 통제 가능
    }
}
