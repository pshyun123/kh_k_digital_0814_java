package 예외처리;

import java.io.IOException;

// 예외처리 미루기(던지기와의 차이 10:35분 수업참고)
public class Exception5 {
    public static void main(String[] args) {
        IOSample test = new IOSample();
//        test.input();// 예외처리 미루기 발생..
        //처리는 try
        try {
            test.input();
        } catch (IOException e) {
            System.out.println("입력 에러 발생");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
class IOSample{
    private int num;
    public void input() throws IOException {
// throws IOException 지우고 여기서 예외처리 try catch 사용해서 하면 위에서 예외처리 안해도 됨
        num = System.in.read();//프린트 보다 약한 애라 예외처리 필요
    }
    public void output() {
        System.out.println(num);//얜 IO처리 안함
    }
}