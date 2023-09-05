package 텍스트파일읽기;

//임의의 위치에 텍스트 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력 해둠.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

//해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기
public class TextFileEx {
    public static void main(String[] args) throws  IOException {
        TreeSet<Student> treeSet = new TreeSet<>();//정렬할 때 사용, 내림 차순이 기본 값.
        FileInputStream fis = new FileInputStream("src/텍스트파일읽기/Score.txt"); // 파일 읽기
        Scanner sc = new Scanner(fis);// 스캐너 생성

        //public static void main(String[] args) {
        //try {
        //inputStream = new FileInputStream("src/텍스트파일읽기/Score.txt");
        //}catch(FileNotFoundException e) {
        //System.out.println("읽을 페이지를 찾지 못했습니다");

        while (sc.hasNext()) { //sc.hasNextLine() 과 동일한 결과 값 나옴
            String[] lineSplit = sc.nextLine().split(" "); //treeSet으로 공백을 기준으로 잘라서 배열에 넣어줌
            treeSet.add(new Student(lineSplit[0],
                    Integer.parseInt(lineSplit[1]),
                    Integer.parseInt(lineSplit[2]),
                    Integer.parseInt(lineSplit[3]))); //이전

//            treeSet.add(new Student(lineSplit[0],
//                    Integer.parseInt(lineSplit[1]),
//                    +Integer.parseInt(lineSplit[2]),
//                    +Integer.parseInt(lineSplit[3]))); //선생님
        }

        for (Student e : treeSet) { // 향상된 for문 활용하여
            System.out.println("이름 : " + e.name + " 총점 : " + e.getTotal()); //이전
        }
    }
}
