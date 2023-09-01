package 쓰레드예제3;
// 쓰레드간의 협업 : wait(), notify(), notifyAll()
// notify() : 일시 정지 상태에 있는 쓰레드를 실행 대기 상태로 변경
// wait() : 자신을 일시 정지 상태로 만드는 것
public class ThMainEx3 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); //객체 생성
        Thread threadA = new ThreadA(sharedObject);
        Thread threadB = new ThreadB(sharedObject);
        //양쪽에 같은 주소가 걸려있다.
        threadA.start();
        threadB.start();
    }
}
//들어올때 잠궈두고 내가 일하고나서 상대방 깨우고 종료하고 반복
//

class WorkObject  {
    //synchronized : 멀티 쓰레드 환경에서 임계영역에 접근 방지하는 역할(Lock / Unlock)
    public synchronized void methodA() { //싱크로나이즈 없애면 실행 x
        System.out.println(("Thread의 methodA() 작업 실행"));
        notify(); //일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듦
        try {
            wait();
        } catch (InterruptedException e) {}
    }
    public synchronized void methodB() {
        System.out.println(("Thread의 methodB() 작업 실행"));
        notify(); //일시 정지 상태에 있는 ThreadA를 실행 대기 상태로 만듦
        try {
            wait();
        } catch (InterruptedException e) {}
    }
}
class ThreadA extends Thread{
    final private WorkObject workObject; //new 로 안하는 이유->지금 null 상태. 생성자 Thread A 에서 대입해주자
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodA(); //객체를 주입받음
        }
    }
}
class ThreadB extends Thread{
    final private WorkObject workObject; //final 붙이는 이유-> 최종 값임
    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodB(); //객체를 주입받음
        }
    }
}