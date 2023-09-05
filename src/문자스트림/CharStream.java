package 문자스트림;

import java.io.*;

// Writer 문자열 기반 출력 스트림의 최상위 클래스로 추상 클래스
// Reader 문자열 기반 입력 스트림의 최상위 클래스로 추상 클래스
public class CharStream {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt");
        char[] data = "곰돌이 사육사".toCharArray(); // 하나하나 문자로 바뀜
        for (int i = 0; i < data.length; i++) {
            writer.write(data[i]);
        }
        writer.write(data);
        writer.flush(); // 버퍼 비우기


        Reader reader = new FileReader("test.txt");
        while (true) {
            int readData = reader.read();
            if(readData == -1) break;
            System.out.print((char)readData); //char 해줘야 아스키 코드 값 아니라
        }
        reader.close();
    }
}
