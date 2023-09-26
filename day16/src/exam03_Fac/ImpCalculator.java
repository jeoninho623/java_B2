package exam03_Fac;

public class ImpCalculator implements Calculator{
    @Override
    public long factorial(long num) {
        long total = 1l;
        for(long i = 1l; i<= num; i++) {
            total *= i;
        }

        return total;
    }
}
