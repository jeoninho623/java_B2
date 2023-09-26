package exam01_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex03 {
    private static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20).forEach(Ex03::add);
        Map<Boolean, List<Student>> students1 = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getGender() == 'F'));

        List<Student> females = students1.get(true);
        List<Student> males = students1.get(false);

        System.out.println("---- Female ----");
        females.stream().forEach(System.out::println);

        System.out.println("---- male ----");
        males.stream().forEach(System.out::println);

    }

    private static void add(int i) {
        int grade = (int)(Math.random() * 3) + 1;   // 1에서 3 사이 학년 랜덤
        int ban = (int)(Math.random() * 3) + 1;     // 1에서 3 사이 반 랜덤
        char gender = (new Random()).nextBoolean() ? 'F' : 'M';

        students.add(new Student(grade, ban, gender, "학생"+i));
    }
}
