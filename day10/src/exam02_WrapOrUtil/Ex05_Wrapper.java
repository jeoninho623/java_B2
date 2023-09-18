package exam02_WrapOrUtil;

public class Ex05_Wrapper {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        System.out.println(i1.equals(i2));
        System.out.println("i1 : 주소 "+ System.identityHashCode(i1));
        System.out.println("i2 : 주소 "+ System.identityHashCode(i2));
    }
}
