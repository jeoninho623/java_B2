package exam02_Generics;

public class Ex01_Gen {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple());  // Object item = new Apple()
        // Apple apple = (Apple)appleBox.getItem();

        Box melonBox = new Box();
        melonBox.setItem(new Melon());  // Object item = new Melon()
        Object obj = melonBox.getItem();
        if(obj instanceof Apple) {
            Apple melon = (Apple) obj;
        }
    }
}
