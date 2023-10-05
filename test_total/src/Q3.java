public class Q3 {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++) {
            // System.out.println(i);
            System.out.printf("===========%d단============%n",i);
            for(int j = 1; j <= 9; j++) {
                if(j > i || j == i) {
                    System.out.printf("%d%n", i * j);
                } else {
                    continue;
                }
            }
        }
    }
}
