package exam04_Generics;

public class Box<T extends Fruit & Eatable> { // Fruit, Apple, Melon ... & Eatable  --> 인터페이스
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printInfo() {
        System.out.println(item.getInfo());
    }
}
