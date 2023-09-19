package exam03_Enum;

public class Ex03_Enum {
    public static void main(String[] args) {
        String str = "BUS";
        // Transportation bus = Enum.valueOf(Transportation.class, str);
        // System.out.println(bus);
        Transportation bus = Transportation.valueOf(str);
        System.out.println(bus);
    }
}
