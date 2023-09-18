package exam01_String;

public class Ex03_String {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(System.identityHashCode(str));

        str += "DEF";
        System.out.println(System.identityHashCode(str));

        str += "GHI";
        System.out.println(System.identityHashCode(str));

        System.out.println(str);
    }
}
