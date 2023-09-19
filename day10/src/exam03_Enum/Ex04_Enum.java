package exam03_Enum;

import static exam03_Enum.Transportation.*;     // 이렇게 임포트해서

public class Ex04_Enum {
    public static void main(String[] args) {
        //Transportation trans = Transportation.BUS;
        Transportation trans = BUS;     // 요렇게 짧게 쓸 수 있다~
        System.out.println(trans.getTitle());
        System.out.println(trans.getTotal(10));

    }
}
