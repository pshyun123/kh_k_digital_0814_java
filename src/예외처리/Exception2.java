package 예외처리;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// Checked Exception : 컴파일러가 컴파일 타임에 예외 상황을 체크함.
public class Exception2 {
    public static void main(String[] args) {
        //입력과 출력 IO, 여기서 scanner, system out 예외처리가 이미 되고 있음
        try {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        br.readLine();
        br.close(); //이 구문에서 파일이 없거나, 못찾거나..
    } catch (IOException e) { //편하지만 에러 원인 찾기 어렵다.
            System.out.println(e);
            System.out.println("파일이 없습니다. 다시 첨부해주세요.");
        }//여기서 다시 기회를 줌
    }
}
