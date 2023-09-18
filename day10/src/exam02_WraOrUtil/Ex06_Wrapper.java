package exam02_WraOrUtil;

public class Ex06_Wrapper {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10000);
        Integer i2 = Integer.valueOf(10000);
        System.out.println(i1==i2);
        System.out.println("i1 : 주소 "+ System.identityHashCode(i1));
        System.out.println("i2 : 주소 "+ System.identityHashCode(i2));
    }
}
