package exam03_Generics;

import java.util.Objects;

public class Box<T extends Fruit>{

    private T item;
    // private static T item2;          처음부터 공간을 만들고 시작하는 static 사용 X
    // private T[] item3 = new T[];     new 연사자 사용 X

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printInfo() {

    }
}
