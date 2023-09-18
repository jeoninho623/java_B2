package exam01_String;

public class Ex09_isBlank {
    public static void main(String[] args) {
        // isEmpty
        String str = "  ";
        System.out.println("str.isEmpty() : " + str.isEmpty());
        System.out.println("str.trim().isEmpty() : " + str.trim().isEmpty());
        System.out.println("str.isBlank() : "+ str.isBlank());
    }
}
