package exam01_String;

public class Ex07_String {
    public static void main(String[] args) {
        String str = "Apple,Orange,Melon,Mango,Apple";
        int pos = str.indexOf("Apple");
        System.out.println(pos);

        int pos2 = str.lastIndexOf("Apple");
        System.out.println(pos2);

        str = str.replace("Apple", "PineApple");
        System.out.println(str);

    }
}
