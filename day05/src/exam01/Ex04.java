package exam01;

public class Ex04 {
    public static void main(String[] args) {
        LoginService l1 = LoginService.getInstance();
        LoginService l2 = LoginService.getInstance();
        System.out.println(l1 == l2);   // 같은 주소값을 가진다
        System.out.println("l1 주소 :"+ System.identityHashCode(l1));
        System.out.println("l2 주소 :"+ System.identityHashCode(l2));
    }
}
