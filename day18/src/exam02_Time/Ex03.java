package exam02_Time;

import java.time.LocalDate;

public class Ex03 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        //int year = date1.get(ChronoField.YEAR);
        int year = date1.getYear();
        int month = date1.getMonthValue();
        int date = date1.getDayOfMonth();
        System.out.printf("year=%d, month=%d, date=%d%n", year, month, date);

    }
}
