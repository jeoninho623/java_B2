package exam02_File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex04 {
    public static void main(String[] args) throws ClassNotFoundException{
        try(FileInputStream fis = new FileInputStream("Book.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Book book1 = (Book)ois.readObject();
            Book book2 = (Book)ois.readObject();
            String str = (String)ois.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
