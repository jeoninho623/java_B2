package exam01;

public class Ex_Static02 {
    public static void main(String[] args) {
        /*Student s1 = new Student(1000, "학생1", "과목1");
        s1.id = 1000;*/

        Student.id= 1002;
        System.out.println(Student.id);

        Student.staticMethod();

    }
}
