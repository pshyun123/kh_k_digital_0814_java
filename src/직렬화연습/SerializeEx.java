package 직렬화연습;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 직렬화 : 객체를 출력하기 위해서는 일렬로 연속적인 바이트로 변경
public class SerializeEx implements Serializable {
    public static void main(String[] args) {
        writerList();
        List<Board> list = readList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Board b : list) {
            System.out.printf("%d %s %s %s %s \n",
                    b.getBno(), b.getTitle(), b.getContent(), b.getWriter(), sdf.format(b.getDate()));
        }
    }
    public static void writerList() {
        List<Board> list = new ArrayList<>();// List 생성
        list.add(new Board(1, "C++", "고성능언어", "ㅇㅇㅇ", new Date()));
        list.add(new Board(1, "Java", "객체지향언어", "ㄷㄷㄷ", new Date()));
        list.add(new Board(1, "Python", "간결한언어", "ㄹㄹㄹ", new Date()));

        FileOutputStream fos = null;
        ObjectOutputStream oos = null; //사라지니까 밖에서 선언해준 것

        try {
            fos = new FileOutputStream("board.db");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);// 객체 출력 스트림을 이용해서 list 출력
            oos.flush();
            oos.close();

        } catch (IOException e) {
        }
    }

    // 읽는 부분
    public static List<Board> readList() {
        try {
            FileInputStream fis = new FileInputStream("board.db");
            ObjectInputStream ois = new ObjectInputStream(fis);// 역직렬화
            List<Board> list = (List<Board>) ois.readObject();
            return list;
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        }
        return null;
    }
}

