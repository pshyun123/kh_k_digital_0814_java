package 집주소번호판만들기;
// 숫자(정수)를 입력
// 해당숫자가 몇 칸을 차지하는지를 출력하는 문제
import java.util.Scanner;

//3단계 중급문제
public class AddressMaker {
    public static void main(String[] args) {
        //각각의 숫자가 차지하는 자리수를 배열로 만들기
        int[] numSize = {4,2,3,3,3,3,3,3,3,3};//0~9의 자리수
        int sum = 0; // 입력 받은 수가 차지하는 총 자리수
        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.next();
            if(number.equals("0")) break; //0이 입력되면 끝남
            //equals 문자열 비교
            for(int i = 0; i< number.length(); i++) {
                sum += numSize[number.charAt(i) - '0'] + 1;//자리수 누적 = 0이 들어오면 4, 아스키코드참고
            }//뒤에 1 더하는 이유는 각 숫자마다 여백이 1칸 필요.
            System.out.println(sum + 1); //처음 공백을 더해주기 위해 1더함
            sum = 0; //for문이 돌며 sum 값이 누적되었으니 다음 계산을 위해 변수 초기화

        }



    }
}
//00