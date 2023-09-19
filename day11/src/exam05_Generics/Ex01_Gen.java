package exam05_Generics;

public class Ex01_Gen {
    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.add(new Apple());
        appleBasket.add(new Apple());

        Juicier.make(appleBasket);

        Basket<Melon> melonBasket = new Basket<>();
        melonBasket.add(new Melon());
        melonBasket.add(new Melon());

        Juicier.make(melonBasket);

        Basket<Toy> toyBasket = new Basket<>();
        toyBasket.add(new Toy());
        toyBasket.add(new Toy());

        //Juicier.make(toyBasket);

    }
}
