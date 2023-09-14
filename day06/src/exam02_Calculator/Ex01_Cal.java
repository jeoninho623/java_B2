package exam02_Calculator;

public class Ex01_Cal {
    public static void main(String[] args) {
        Calculator cal = new SimpleCalculator();
        int result = cal.add(10,20);
        System.out.println(result);
    }
}