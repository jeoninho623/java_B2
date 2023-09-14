package exam03_Order;

public class Ex01_Order {
    public static void main(String[] args) {
        Order order = new Order();
        order.buy();
        order.sell();

        Seller seller = order;
        seller.sell();
        System.out.println( seller instanceof Order);

        Buyer buyer = order;
        buyer.buy();
        System.out.println( buyer instanceof Order);
    }
}
