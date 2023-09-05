package 파일스트림읽기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStreamRead {
    public static void main(String[] args) {
        FileInputStream inputStream = null; //
        try {
            inputStream = new FileInputStream("src/파일스트림읽기/텍스트파일.txt");
        } catch (FileNotFoundException e) {
            System.out.println("읽을 파일을 찾지 못함.");
        }
        Scanner sc = new Scanner(inputStream); //
        while (sc.hasNext()) { //다음 라인 있어? 읽을 내용 있으면 참이 됨
            String line = sc.nextLine(); // 문자열을 줄바꿈 기준으로 읽음
            System.out.println(line);
            // System.in 생성자, 표준 입력에서부터 읽으세요.
        }

    }
}
