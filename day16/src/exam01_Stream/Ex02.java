package exam01_Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Orange","Melon"};

        String str = Arrays.stream(fruits).collect(Collectors.joining(","));
        System.out.println(str);
    }
}
