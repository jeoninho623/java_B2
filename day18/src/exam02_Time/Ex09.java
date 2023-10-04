package exam02_Time;

import java.time.ZoneId;

public class Ex09 {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
    }
}
