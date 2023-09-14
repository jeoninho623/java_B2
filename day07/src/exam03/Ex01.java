package exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex01 {
    public static void main(String[] args) {
        // FileNotFoundException
        try {
            FileInputStream fis = new FileInputStream("a4.txt");

            System.out.println("이상 X");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("중요한 코드~");
    }
}
