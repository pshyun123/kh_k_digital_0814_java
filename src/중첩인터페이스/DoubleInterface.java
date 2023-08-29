package 중첩인터페이스;
// 중첩 인터페이스는 클래스 내부에 선언한 인터페이스
// 안드로이드에서 자주 나옴. 이미 완성된 구현체로
// 주로 UI프로그래밍에서 이벤트 처리를 목적으로 사용
public class DoubleInterface {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClickListener(new CallListener()); //버튼 눌릴때 어떤 동작을 하게할건지 괄호에. 의존형주입
        btn.touch();
        btn.setOnClickListener(new MessageListener());
        btn.touch();
    }
}
