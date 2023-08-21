package 커맨드라인;
//main 메소드는 자바프로그램의 시작 지점임.
//믹서기 예시 오렌지, 설탕 ; 매개변수 //함수 또는 메소드에서 수행한 다음에 return 값으로 나옴, 오렌지주스
//main 도 함수임. 메소드에서 넣어주기 힘들어서 커맨드 라인에서 넣어주는 것
// (String[] args)여기다가 값 넣어주기
//CLI (Command Line Interface) : 입력
public class CommandLineEx {
    public static void main(String[] args) {//매개 변수들 args

        if(args.length != 2) { //두개만 받겠다는 뜻
            System.out.println("프로그램 사용법");
            System.out.println("Java Main String Argument num1 num2");
            System.exit(0); // 프로그램 강제 종료/외부에서 개입해서 종료
        }
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
