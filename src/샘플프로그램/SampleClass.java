package 샘플프로그램; // 패키지 명 : 클래스의 묶음
/*
범위 주석 지정: 누가, 언제
    Date : 20230814
    Author :
    Porpose : 샘플프로그램 제작
 */

//public (or nothing), 접근제한자이며 모두 허용
public class SampleClass {

    public static void main(String[] args) {
        //메서드에 대한 접근제한자는 public, protected, private, 아무것도 없는 디폴드
        //누구까지 접근해줄건지, public은 모두
        //static-?
        //void: 비어있다. 넘겨줄 게 없다.(이게 메인이니까) 메인은 진입지점 "함수가 끝날 때 리턴값이 없다"

        System.out.println("샘플 프로그램을 만들어 봅니다.");
        //println 줄바꿈 있다.
    }
}
