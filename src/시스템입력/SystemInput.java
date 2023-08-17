package 시스템입력;

import java.util.Scanner;

// Scanner 클래스를 사용해서 입력받음
public class SystemInput {
    public static void main(String[] args) {
//        //sc는 클래스에 대한 변수
//        //클래스는 설계 도면이라고 생각하면 됨.

//        //sc : 변수, 스캐너에 대한 객체 생성
//        byte a = sc.nextByte(); //byte형 입력(키보드 입력)을 받아 반환, 127까지 가능
//        short b = sc.nextShort(); //short형의 입력을 받아 반환
//        int c= sc.nextInt(); //int혐의 입력을 반환
//        long d = sc.nextLong(); //long 형의 입력을 받아 반환
//        char ch = sc.next(). charAt(0); //문자열에서 0번째 문자를 추출, 알고리즘에 많이 쓰임
//                                       // 해당하는 인덱스에 대한 문자 하나만 출력,
//        float e = sc.nextFloat(); // float형 입력을 받아 반환
//        double f = sc.nextDouble(); //double 형 입력을 받아 반환
//        String h = sc.next(); //공백 기준으로 입력받음
//        String i = sc.nextLine(); //줄바꿈 문자기준

        Scanner sc = new Scanner(System.in);// 이름을 입력받은 후 공백이나 줄바꿈이 일어나면 다음으로 넘어 감
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next(); //이름 입력 받은 후 공백이나 줄바꿈이 일어나면 다음 입력으로 넘어감
        sc.nextLine(); //버퍼 비우기
        System.out.print("주소를 입력하세요 : ");
        String addr = sc.nextLine(); //줄 바꿈이 일어나면 다음 입력으로 넘어감
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);//입력받은 문자열에서 맨앞 문자 추출
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("=====회원 정보 출력=====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);




    }



}
