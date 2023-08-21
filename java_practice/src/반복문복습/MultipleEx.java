package 반복문복습;
//구구단
public class MultipleEx {
    public static void main(String[] args) {
      for(int i = 2; i < 10; i++) {
          for (int j = 1; j < 10; j++) {
              System.out.printf("%d x %d\n", i, j, (i * j));
          }
          System.out.println();
      }
    }
}
//3*5 =15 이런식으로 표현하려면?