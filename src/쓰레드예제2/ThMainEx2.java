package 쓰레드예제2;
import static java.lang.Thread.sleep;
//다른 쓰레드의 종료를 기다림(join())
public class ThMainEx2 {
    public static void main(String[] args)  {//메인은 접근제한자 풀고들어옴. 메인은 하나여서 스태틱
        //----2번 //void 반환값이 없음 메인에서 시작해서 끝
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join(2); //sumThread가 작업 완료할때까지 기다림
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("합 : " + sumThread.getSum());
    }
}//run이 되기전에 메인이 끝남. sleep에 값을
class SumThread extends Thread {//---1번
    private long sum; //sum 값을 고정
    public long getSum() {
        return sum;
    }
    public void setSum(long sum)
    {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i = 0; i <= 2100000000; i++) {
            sum += 1;
        }
    }
}

//class 앞에는 public or X
//메소드에서는 네가지 다