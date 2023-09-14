package exam02;

public class Student {

    // 멤버 변수
    int id; // 학번
    String name; // 학생명
    String subject; // 전공 과목

    void study() {      // 메서드
        System.out.printf("학번 : %d, 이름 : %s, 전공과목 : %s%n", id, name, subject);

    }
}