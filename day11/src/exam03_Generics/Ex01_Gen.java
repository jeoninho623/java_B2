package exam03_Generics;

public class Ex01_Gen {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();      // T (Object)가 실행 중에 Apple로 변경
        appleBox.setItem(new Apple());
        //appleBox.setItem(new Melon());
        Apple apple = appleBox.getItem();

        // Box<Toy> toyBox = new Box<>();
    }
}
