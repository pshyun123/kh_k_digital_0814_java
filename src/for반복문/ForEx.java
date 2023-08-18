package for반복문;
//for(초기식; 조건식; 증감식) {참인동안 수행되는 구문}
//주로 정해진 횟수를 반복하는 경우에 사용
public class ForEx {
    public static void main(String[] args) {
//        for(int i = 1; i <= 100; i++) {
//            System.out.printf("%4d", i); //printf는 오른쪽기준으로 네개, 100의자리
//            if(i % 10 == 0) System.out.println();//10/10 나머지는 0
//        }
        int i = 1;
        while(true) {
            System.out.printf("%4d, i");
            if(i % 10 == 0) System.out.println();
            i++;
            if(i > 100) break;
        }

    }
}
