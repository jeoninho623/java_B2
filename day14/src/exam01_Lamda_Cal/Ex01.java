package exam01_Lamda_Cal;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = (a, b) -> a + b;
        add(cal);

        add((a,b) -> a + b);
    }

    public static void add(Calculator cal) {        // Calculator cal = (a, b) -> a + b;
        int result = cal.add(10,20);
        System.out.println(result);
    }

    public static Calculator getCalculator() {
        Calculator cal = (a ,b) -> a + b;
        return cal;
    }
}
