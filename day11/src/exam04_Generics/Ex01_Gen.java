package exam04_Generics;

public class Ex01_Gen {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.setItem(new Apple());

        Apple apple = box.getItem();
    }
}
