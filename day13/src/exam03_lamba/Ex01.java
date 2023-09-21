package exam03_lamba;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = (a, b) ->  a + b;      // 코드가 한 줄이면, {...} 생략, return도 생략, 변수명도 한글자로 지정
        calc(cal);
        calc((a , b) -> a + b);

        //int result = cal.add(10,20);
        //System.out.println(result);
    }

    public static void calc(Calculator cal) {
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
