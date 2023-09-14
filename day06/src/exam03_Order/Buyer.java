package exam03_Order;

public interface Buyer {
    void buy ();

    default void order() {  // default 가 있더라도 접근 제한은 public
        System.out.println("buyer 주문!");
        privateMethod();
    }

    public static void staticMethod() {
        System.out.println("정적 메서드");
    }

    private void privateMethod() {
        System.out.println("Private 메서드");
    }

}
