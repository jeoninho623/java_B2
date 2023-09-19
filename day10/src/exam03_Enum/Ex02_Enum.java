package exam03_Enum;

public class Ex02_Enum {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        System.out.printf("trans.ordinal() : %d, trans.name() : %s%n", trans.ordinal(), trans.name());
    }
}