package exam02_File;

import java.io.File;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:/uploads/folder1/folder2/../../folder3/folder4");
        File file = new File(dir, "test.txt");
        if (!dir.exists()) {
            dir.mkdirs(); // --> mkdir (내 생각엔 make directory 줄임말인듯 여러개는 s 붙힘)
        }

        file.createNewFile();
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
    }
}
