package exam01_String;

public class Ex08_SubString {
    public static void main(String[] args) {
        // substring(s, e) s 이상 e 미만
        // subString(s) : s 위치부터 끝까지
        // lastIndexof

        String fileName = "abc.def.txt";

        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println(extension);
    }
}
