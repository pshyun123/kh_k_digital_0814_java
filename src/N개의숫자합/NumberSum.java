package N개의숫자합;
// 2단계 초급문제
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
// 입력으로 주어진 숫자 N개의 합을 출력한다.
// 힌트) 입력을 문자열로 간주해야 함. 문자열에서 하나의 문자를 추출해야 함. 숫자에 대한 아스키코드값이 있음(...)
// 추출한 문자가 1이라면, '0'이 48

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += num.charAt(i) - '0'; //이렇게 하면 아스키 코드 값이 입력됨

        }
        System.out.println(sum);
//5를 입력하고 12345를 입력하면 15
    }
}
