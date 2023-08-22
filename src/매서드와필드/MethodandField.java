package 매서드와필드;
//매서드 : 클래스 내에서 동작에 대한 기능을 구현하는 것(함수가 클래스 내부에 있으면 메서드로 함)
//필드 : 클래스 내에 존재하면서 값을 저장하는 변수를 의미. (상태를 저장) 인스턴스필드는 객체,
public class MethodandField {
    public static void main(String[] args) {
//        int result = sum(100, 200, 300,400);
        int result= whileSum(10);
       System.out.println(result);
    }
    //메소드 앞에 static 선언하는 경우, 객체소속 아니고 클래스 소속
    static int sum(int a, int b) {
        return a + b;
    }
    //sum 메서드의 매개변수 개수를 다르게 해서 만들었으므로 오버로딩관계가 성립
    static int sum(int a, int b, int c) {
        return  a + b + c;
    }
    static int sum(int...val){ //전개연산자: 매개변수의 개수를 알 수 없는 경우 사용

        int sum = 0;
        for(int e : val) sum += e;
        return sum;
    }
    //재귀 호출 : 메서드 자신이 자신을 호출
    static int recFunc(int n) {
        if(n == 1) return 1;
        return n + recFunc(n -1);
    }
    static int whileSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum+=n;
            n--;
        }
        return sum;
    }
}
