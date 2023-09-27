package exam01_Output;

import java.io.*;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        System.out.print("아무 문자 입력 : ");
        /*char ch = (char)System.in.read();
        System.out.println(ch);*/
        //Reader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);

        /*char ch = (char)isr.read();
        System.out.println(ch);*/
    }
}
