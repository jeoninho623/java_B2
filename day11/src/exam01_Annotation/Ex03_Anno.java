package exam01_Annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Ex03_Anno {
    public static void main(String[] args) {
        Class cls = Ex02_Anno.class;
        MyAnno anno = (MyAnno) cls.getAnnotation(MyAnno.class);
        String[] values = anno.value();
        System.out.println(Arrays.toString(values));
        int max = anno.max();
        int min = anno.min();
        System.out.printf("max = %d, min = %d%n", max, min);
    }
}