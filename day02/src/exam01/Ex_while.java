package exam01;

public class Ex_while {
    public static void main(String[] args) {

        int num = 1, total = 0;

        while (num < 1) {
            total += num;
            num++;
        }
        System.out.println(total);
    }
}
