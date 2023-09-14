package exam02;

public class Ex_Func01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        /*
        s1.year = 2023;
        s1.month = 2;
        s1.day = 31;
        */

        s1.setYear(2023);
        s1.setMonth(2);
        s1.setDay(26);

        s1.showInfo();

        int month = s1.getMonth();
        System.out.println(month);
    }
}
