package exam03_Fac;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal1 = new ProxyCalculator(new ImpCalculator());
        long result1 = cal1.factorial(10l);
        System.out.println("cal1 : " + result1);

        Calculator cal2 = new ProxyCalculator(new RecCalculator());
        long result2 = cal2.factorial(10l);
        System.out.println("cal2 : " + result2);
    }
}
