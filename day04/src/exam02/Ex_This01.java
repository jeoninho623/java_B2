package exam02;

public class Ex_This01 {
    public static void main(String[] args) {
        Schedule2 s1 = new Schedule2(2023,9,8);


        System.out.println("s1 : " + s1);
        System.out.println("s1 주소 : " + System.identityHashCode(s1));

        s1.printThis();
    }
}
