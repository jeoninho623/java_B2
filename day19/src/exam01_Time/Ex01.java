package exam01_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();        // 현재 시간 출력
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy.MM.dd HH:mm (E)");        // 형식화
        String strDate = formatter.format(now);
        System.out.println(strDate);
    }
}