package exam03_Order;

public interface Seller {
    void sell();

    default void order() {
        System.out.println("seller 주문!");
    }
}
