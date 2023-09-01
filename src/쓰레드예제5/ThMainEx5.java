package 쓰레드예제5;

import static java.lang.Thread.sleep;

//데몬 쓰레드 : 다른 스레드의 작업들 돕는 보조적인 쓰레드
//데몬 스레드 이외의 스레드가 모두 종료 되면 데몬 스레드도 자동 종료됨
//자동저장기능
public class ThMainEx5 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveTh autoSaveTh = new AutoSaveTh();
        autoSaveTh.setDaemon(true); // 데몬 쓰레드 만드는 방법
        autoSaveTh.start();
        sleep(30000);
    }
}
class AutoSaveTh extends Thread {
    public void save() {
        System.out.println("작업내용을 저장함");
    }
    @Override
    public void run() {
        while (true) {
            try {
                sleep(3000);//
            } catch (InterruptedException e) {}
            break;


        }
        save();
    }
}