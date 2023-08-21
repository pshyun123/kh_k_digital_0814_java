package 반복문복습;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오.");
        int n = sc.nextInt(); //정수를 n으로 두고 엔터/공백치면 넘어감
        int sum = 0;
        while(n > 0) { //참일경우 반복수행
            sum += n; // sum = sum + n;
            n--; // n의 값을 1씩 줄인다.
        }
        for(int i = 1; i <= n; i++) { //i는 1이고, I가 n보다 작거나 같을때 i값을 증가하세요
            sum += i; // 합계값에 i를 더하세요.
        }
        System.out.println("주어진 정수의 합 : " + sum);
    }
}
//이거 이해가 안감/ 영상 다시 시청
