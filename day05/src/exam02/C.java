package exam02;

public class C extends B{
    int numC = 30;

    public C() {
        super(); // 따로 정의하지 않아도 자동 추가    B() 추가
        System.out.println("C 생성자~");
    }
}
