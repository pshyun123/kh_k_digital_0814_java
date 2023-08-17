package 시스템출력;
// System.out : 표준 출력 스트림
// print, println : 오버로딩이 적용된 메소드이며 줄바꿈 차이만 있음

import java.util.Scanner;

public class SystemOut {
    public static void main(String[] args) {

        String name = "곰돌이사육사";
        String addr = "수원시";
        int age = 22;
        double pi = 3.1415921213;
        char gender = 'M';
        int kor = 99, eng = 88, mat = 40;

        //자바 스타일 : 오버로딩으로 구현되어 있음, print println 타입별로
//    System.out.println("======== Java Style =========");
//    System.out.println("이름 : " + name);
//    System.out.println("주소 : " + addr);
//    System.out.println("성별 : " + gender);
//    System.out.println("나이 : " + age);//문자열 + 정수 , 문자열로 바뀌어서
//    System.out.println("총점 : " + kor + eng + mat); //틀린 식
//    System.out.println("총점 : " + (kor + eng + mat));
//    //옳은 식, 연산자 우선순위 변경해 먼저 덧셈을 수행
//    System.out.println("평균 : " + ((double)kor + eng + mat / 3));//틀린식, 나누기가 먼저 일어남
//    System.out.println("평균 : " + ((double)(kor + eng + mat) / 3));
//    System.out.println("평균 : " + ((kor + eng + mat) / 3.0));
////    //옳은 식, ()사용해서 덧셈의 연산자 우선순위를 나눗셈보다 높여줌

//    System.out.println(age);
//    System.out.println(name);
//    System.out.printf("%s\n", name);//오버로딩
//    System.out.printf("%.2f\n", pi);


        //C언어 스타일 : 서식을 지정하는 스타일. 동일한 메소드 이름 안 됨
        //서식지정자 : %d(정수,십진수의미), $ld(정수, long타입, %u(보호 없는 정수형)%f(실수형), %c(문자)
        //이스케이브시퀀스 : \n(줄바꿈), \r(캐리지 리턴)-커서를 라인의 처음으로,\t(탭), /b(백스페이스, 앞글자 지워줌), \\
//
//        System.out.printf("이름 : %s\n", name);//%s는 string
//        System.out.printf("오늘의 습도는 %.2f%% 입니다.", 85.5555555); //실수형 출력, 소수점 이하 2자리까지 출력
//        System.out.printf("성별: %c\n", gender); //문자 출력
//        System.out.println("안녕하세요 \\ 저의 이름은 \"곰돌이사육사\"입니다.");
//        System.out.printf("평균 : %.2f\n", (kor + eng + mat) / 3.0);
//        System.out.println("Apple\rBanana\tOrange\b\b\n");
//        System.out.printf("|%-6d|%-6d|%-6d\n", 100, 2000, 30000);


//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <=n * n; i++) {
//            System.out.printf("%4d", i); //4칸씩 띄고
//            if(i % n == 0) System.out.println(); //나머지가 0
        }

   }


