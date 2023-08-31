package 학생성적정렬;
//5명의 학생에 대해 이름과 성적 입력. 성적 높은사람 수능로 정렬, 성적이 같으면 이름이 정렬
//미리 입력 받아두고 시작한다.
//컴페어러블을 이름,성적이 포함된 클래스만들어서
import 클론오브젝트.Member;

import java.util.TreeSet;


public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("안유진", 95));
        info.add(new StudentInfo("장원영", 77));
        info.add(new StudentInfo("ㅇㅇㅇ", 65));
        info.add(new StudentInfo("ㄷㄷㄷ", 79));
        info.add(new StudentInfo("ㄹㄹㄹ", 80));
        for(StudentInfo e : info) {
            System.out.print(e.name + ", " + e.score);
        }

    }
}

    class StudentInfo implements Comparable<StudentInfo>{
        String name;
        int score;
        public StudentInfo(String name, int score){
            this.name = name;
            this.score =score;
        }

        @Override
        public int compareTo(학생성적정렬.StudentInfo o) {
            if(this.score < o.score) return 1; //내림차순 정렬
            else{
                return this.name.compareTo(o.name); //사전순 정렬. 앞에값이 크면 뒤집는다.(return 1)
            }
        }
    }


