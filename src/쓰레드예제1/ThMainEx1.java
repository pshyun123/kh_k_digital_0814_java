package 쓰레드예제1;
//하나의 프로그램 내에서 여러가지 일을 동시에 수행하는 것
public class ThMainEx1 {
    public static void main(String[] args) {//----2번
    //main은 JVM이 관리하는 '쓰레드'임
        //Thread 클래스를 상속받아서 Thread 생성
        Thread testTh = new CustomTread();
        testTh.start();
        //run을 부르지 않고 start를 부름. 왜? 운영체제한테 시작해달라고 요청,
        //run을 직접부르지 않음. 스타트를 넣어두면 운영체제가 알아서 불러줌
        //실행대기로 넘어감


        //Runnable 인터페이스를 상속받아서 쓰레드를 만드는 방법----4번
        Runnable runTask = new InterThred(); // 실제 작업내용 가지고 있지만 실제 쓰레드는 아님
        Thread runTh1 = new Thread(runTask); // 실제 쓰레드 만들어줌, 생성자를 만들어주고
        Thread runTh2 = new Thread(runTask);
        runTh1.start();
        runTh2.start();//스타트
//        System.out.println("Main에서 찍어봅니다.");

    // 익명객체로 쓰레드 만드는 방법. 러너블 인터페이스를 상속받아서 구현부 만들어줌,
        // 쓰레드를 상속받은게 아님. 클래스 이름 필요 없기 때문에 익명객체
        Runnable task = new Runnable() {
            // 러너블은 인터페이스로 추상화 되어있음 실제 객체가 될 수 없기 때문에 익명객체가 필요.
            // 구현부가 있음 -> new Runnable();이건 안됨
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i <= 10; i++){
                    sum += i;
                    System.out.println("인터페이스 :" + sum);//sum 앞에 넣어줌
                }
                System.out.println(Thread.currentThread() + "합 : " + sum);

            }
        };//;로 꼭 닫아주기
        Thread anonyTh1 = new Thread(task);
        anonyTh1.start();

        //람다식으로 쓰레드 구현하기
        Runnable task2 = () -> {
                int sum = 0;
                for(int i = 0; i <= 10; i++){
                    sum += i;
                    System.out.println("인터페이스 :" + sum);//sum 앞에 넣어줌
                }
                System.out.println(Thread.currentThread() + "합 : " + sum);
        };
    }
}
//상속 받아서 쓰레드 만드는 방법 start 쓰레드 써줌
class CustomTread extends Thread{ //부모 클래스 상속----1번
@Override
        public void run(){
    int sum = 0;
    for(int i = 0; i <= 10; i++){
        sum += i;
        System.out.println("상속받은 쓰레드 :" + sum);//sum 앞에 넣어줌
    }
    System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
//상속관계가 필요하다면 러너블로
class InterThred implements Runnable{//----3번
//Runnable 인터페이스 상속은 여러개 무한대로 받을 수 있음 제약사항 없음
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++){
            sum += i;
            System.out.println("인터페이스 쓰레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}

//쓰레드 네개가 실행중, 메인은 이미 진작에 끝남