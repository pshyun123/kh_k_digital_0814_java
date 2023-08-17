package 형변환;
// 형변환 : 하나의 데이터 타입을 다른 타입으로 변환하는 것(숫자->문자, 문자->숫자)
// 명시적 형변환 : 개발자가 의도를 가지고 형변환을 하는 것
// 묵시적 형변환 : 컴파일러가 자동으로 해주는 것(유리한 방향으로 변경, 3.14+3이면 6.4)
public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
//        double result1 = num1 / num2; //형변환 안 일어남
//        double result2 = (double)num1 / num2; //묵시적 형변환 일어남
        //(double)num1 / num2 둘다 더블로 바꿔짐
        String kor = "90";//문자로 취급
        int mat = 88;
        int eng = 55;

        int total = Integer.parseInt(kor) + mat + eng;
        double avg = (double) total / 3; //int를 double로 바꿔줘야 avg 값 제대로 나옴
        System.out.println(avg);
    }
}
