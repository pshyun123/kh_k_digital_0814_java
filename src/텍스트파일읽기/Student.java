package 텍스트파일읽기;

public class Student implements Comparable <Student>{//comparable 내 객체와 다른 객체 비교
    //방법1
    String name;
    int kor;
    int eng;
    int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name; // 이름
        this.kor = kor; // 국어
        this.eng = eng; // 영어
        this.mat = mat; // 수학
    }
    int getTotal() {
        return kor + eng + mat; // 합계를 getTotal로 만들어주고
    }
    @Override
    public int compareTo(Student o) { //compareTo() 함수는 두개의 값을 비교하여 int 값으로 반환해주는 함수
        if(this.getTotal() < o.getTotal()) return 1; // 뒤에 값이 앞에 값보다 크면 바꿔줌
        else return -1; // return 0 하면 함수값이 중복 값 삭제 하므로 -1로 처리

    }
}
