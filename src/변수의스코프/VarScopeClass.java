package 변수의스코프;
//변수가 할당되고 사용되는 범위 확인

public class VarScopeClass {
    public static void main(String[] args) {

        //문자 자료형 : 자바에서는 유니코드를 사용(2바이트로 전 세계의 모든 문자를 표시.)
        //            앞의 1바이트는 ASCII와 동일

        //String ch = "A"; 큰 따옴표 사용 하려면 스트링
        char ch = 'A' ;//자바에서 문자는 작은 따옴표 사용, 실제 저장은 정수 값으로 저장됨.
//        System.out.println(ch);
//        System.out.println((int)ch); //명시적으로 형을 변경

        char ch2 = 66; // char형은 음수가 올 수 없음.
//        System.out.println(ch2);
//        System.out.println((int)ch2);


        //실수 자료형 : float(4Byte, 32bit), double(8Byte)- 프로그래밍에서는 안 써야함, 근사치 계산법
        //값을 두배크기로 해서 나누는 등의 방법으로 정수로 표현
        //cf) 속도는 비트 저장공간은 바이트
        float height = 175.5f;
        double pi = 3.141592;//실수일 경우 더블로 많이 사용

        double num1 = 0.1;
        for(int i = 0; i < 1000; i++){

            num1 += 0.1;

        }

        System.out.println(num1);



    }
}
