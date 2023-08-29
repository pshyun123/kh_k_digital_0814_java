package 박싱과언박싱;

public class BoxingMain {
    public static void main(String[] args) {
    Integer num = 12;
    //오토박싱, 왜냐하면 인티저는 객체타입, 기본타임값을 집어 넣은 것
    // 원래 참조타입 값을 대입 안되는 앤데 오토박싱해줘서 가능
    //    Integer num = new Integer(12);
    // 원래 이게 기본적인 형태, 이제는 사용중지
    //    System.out.println(num);
    Character ch = 'X';//오토 박싱
    char c = ch; // 오토 언박싱
    System.out.println(c);
    }
}
