package exam01;

public class Ex03 {
    public static void main(String[] args) {
        try(MyResource myResource = new MyResource()) {

            if(myResource instanceof AutoCloseable){

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
