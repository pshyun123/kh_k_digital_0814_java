package 중첩인터페이스;

public class CallListener implements Button.OnClickListener{
    @Override
    public void onClick() {
        System.out.println("전화걸기");
    } //콜이 걸렸는지 감지, 버튼 내부에 있는 온클릭리스트 오버라이딩 함

}
