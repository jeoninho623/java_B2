package exam01;

public class Ex_String02 {
    public static void main(String[] args) {
        String str1 = "가나다";
        String str2 = "가나다";

        System.out.println(str1.equals(str2));
        System.out.printf("str1 주소값 : %d, str2 주소값 : %d%n",
                System.identityHashCode(str1),System.identityHashCode(str2));
    }
}
