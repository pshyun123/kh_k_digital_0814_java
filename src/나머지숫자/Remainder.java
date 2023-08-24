package 나머지숫자;
// 10개의 수를 입력 받은 뒤, 이를 42로 나눈 나머지를 구람
// 나머지를 구한 다음 서로 다른 값이 몇개인지 구하는 문제
// 숫자 10개를 입력 받음
import java.util.Scanner;

//
public class Remainder {
    public static void main(String[] args) {
        int[] arr = new int[42];// 배열 42개, 나머지 값을 여기에 다 넣을 예정

        int cnt = 0; // 42로 나눈 나머지가 다른 경우에 대한 총 횟수
        int input; //입력받은 값(방을 만듦)

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 10개 입력 : ");// 전제조건
        for (int i = 0; i < 10; i++) { //for문 10번 돌림.
            input = sc.nextInt();      // 값을 input에 대입
            arr[input % 42] = 1;
            //★입력받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입,
            // 1을 대입하는 자리가 나머지가 구해진 위치.★
        }
        for (int val : arr) cnt +=val; //향상된 for문,
        System.out.println(cnt);

    }
}
//00