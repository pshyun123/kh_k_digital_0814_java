package While문;
import java.util.Scanner;
// 주어진 조건이 참인 동안 해당 블록{ }을 반복 수행
// 주로 반복 횟수를 알 수 없는 경우에 사용
public class while문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위해 스캐서 생성
        //가이드 작성
        System.out.println("정수를 입력하시오.");
        int n = sc.nextInt();
        int sum = 0; //합계를 구한 변수를 초기화, 지역변수(초기화 안함. 지역변수 범위를 만나면 자동소멸)
        while (n > 0) { //이블럭구간이 참인경우 반복 수행 ex. 10일경우 9로 8로
            sum += n;   //sum = sum + n;???
            n--;  //이게 탈출조건. 입력 받은 값을 1씩 감소시킴
        }
        // 초기식;조건식;증감식
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("주어진 정수의 합 : " + sum);
// 10 = 0+0
//19 = 10+9
//27 = 19+8



    }
}

