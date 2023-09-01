package 쓰레드예제4;
//쓰레드 안전하게 종료하기, stop() 메소드는 사용중지됨

import static java.lang.Thread.sleep;

public class ThMainEx4 {
    public static void main(String[] args) throws InterruptedException { //---2번
        RunThread runThread = new RunThread();
        runThread.start();
        try {
        sleep(1000);
    } catch (InterruptedException e){}
      runThread.interrupt();
}
static class RunThread extends Thread{ //----1번
//    private boolean stop = false; // stop 플래그 설정
//    public void setStop(boolean stop) {
//        this.stop = stop; //외부 메소드에서 가져옴
//    }
    @Override
    public void run() { //쓰레드는 무한대로 실행되는 경우 많음.
        try {
            while (true) {//무한대로 돈다.//----2번
                System.out.println("Thread 실행중......");
                sleep(1); //잠을 자야 인터럽트 걸 수 있음. 자는 순간에 들어감
            }
        } catch(InterruptedException e) {
            System.out.println("인터럽트 발생!!");
        }
        System.out.println("자원 정리...");
        System.out.println("실행 종료...");
    }
  }
}