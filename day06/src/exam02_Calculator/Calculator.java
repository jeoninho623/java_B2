package exam02_Calculator;

public interface Calculator {
    //interface 안에서는 구현체가 없어야함
    int num = 10;   // public static final -> 정적 상수
    int add(int num1, int num2); // 추상메서드 작성    public abstract만 자동으로 추가 됨 / 그 외 접근 제어자 사용불가
}
