package exam03_Fac;

public class ProxyCalculator implements Calculator{

    private Calculator calculator;

    ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
    @Override
    public long factorial(long num) {
        long stime = System.nanoTime();
        try {
            long result = calculator.factorial(num);

            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린 시간 : %d%n", etime - stime);
        }
    }
}
