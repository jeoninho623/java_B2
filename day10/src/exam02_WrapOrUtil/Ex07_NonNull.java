package exam02_WrapOrUtil;

import java.util.Objects;

public class Ex07_NonNull {
    public static void main(String[] args) {
        String str = null;
        str = Objects.requireNonNullElse(str,"abc");
        System.out.println(str.toUpperCase());
    }
}
