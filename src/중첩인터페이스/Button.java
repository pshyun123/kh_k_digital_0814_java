package 중첩인터페이스;

public class Button {
    OnClickListener listener; //생성된 객체의 주소를 대입받기 위함,참조변수

    void setOnClickListener(OnClickListener listener){//주입;외부에서 객체를 넣어주는 것
        this.listener = listener;
    }
    void touch() {
        listener.onClick();// 구현 객체의 onClick()메소드 호출..
    }

    //클래스 내부에서 인터페이스를 만듦(중첩인터페이스)
    interface OnClickListener {
        void onClick();
    }
}

