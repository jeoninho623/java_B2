package exam03_Fac;

public class Ex01 {
    public static void main(String[] args) {
        long stime = System.nanoTime();     // 추가 기능

        ImpCalculator cal1 = new ImpCalculator();
        long result1 = cal1.factorial(10);  // 핵심 기능
        System.out.println("cal1 : " + result1);

        long etime = System.nanoTime();     // 추가 기능
        System.out.printf("걸린시간 : %d%n", etime - stime);

        stime = System.nanoTime();      // 추가 기능

        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10);  // 핵심 기능
        System.out.println("cal2 : " + result2);

        etime = System.nanoTime();      // 추가 기능
        System.out.printf("걸린시간 : %d%n", etime - stime);
    }
}
