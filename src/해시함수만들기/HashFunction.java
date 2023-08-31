package 해시함수만들기;
//실제 만들 필요 없음. 개념 이해용

import java.util.Scanner;

public class HashFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String in = sc.next();
        int sum = 0;
        for(int i = 0; i < in.length(); i++){
            sum += in.charAt(i); //문자열에서 문자의 아스키 코드값 더해줌
        }
        System.out.print("배열의 인덱스 : " + (sum % 100));
    }
}
//임의의 문자열 찾아서 배열의 인덱스 찾아줌
//콜리전 일어날 경우, 링크드 리스트로 체인으로 묶는다
