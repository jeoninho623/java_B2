package exam01;

public class Ex_For {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            total += i;
           /* if (i == 50 ) {
                break;
            }*/
            /*if( i % 2 == 1 ) {    // 홀수
                total += i;

            }*/
        }
        System.out.println(total);
    }
}
