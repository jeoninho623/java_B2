package exam01_Output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex09 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(new FileOutputStream("log.txt",true));
        System.setErr(ps);

        int result = 10/0;

    }
}
