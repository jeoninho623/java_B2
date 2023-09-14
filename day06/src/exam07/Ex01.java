package exam07;

public class Ex01 {
    public static void main(String[] args) {
        Ex_Outer out = new Ex_Outer();
        Ex_Outer.Inner in = out.new Inner();
        in.method();
    }
}
