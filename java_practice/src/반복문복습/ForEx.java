package 반복문복습;

public class ForEx {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();

        }
    }
}
//말로 한번만 설명 필요