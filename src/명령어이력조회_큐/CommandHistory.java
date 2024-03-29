package 명령어이력조회_큐;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class CommandHistory {
    Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;
    public static void main(String[] args) {
            CommandHistory history = new CommandHistory(); //자료구조는 똑같이 쓰는데 중간삽입 못하게 하려고 막아둠. ex.add
            System.out.println("help 입력시 도움말 볼 수 있음");

            while(true) {
                System.out.print("$");
                Scanner sc = new Scanner(System.in);
                String cmd = sc.nextLine().trim();//입력받은 문자열 앞,뒤의 공백제거
                if(cmd.equalsIgnoreCase("q")){ //Q나 q를 치면
                    System.exit(0); //프로그램 강제종료
                } else if (cmd.equalsIgnoreCase("help")){
                    System.out.println("help - 도움말 보기");
                    System.out.println("Q/q = 프로그램 종료");
                    System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                }else if(cmd.equalsIgnoreCase("history")){
                    history.save(cmd);
                    int cnt = 0;
                    for(String e : history.queue) {
                        cnt++;
                        System.out.println(cnt + " " + e);//카운트 하는 숫자 넣고 공백넣고
                    }
                } else {
                    history.save(cmd);
                    System.out.println(cmd);
                }
            }
    }
    void save(String cmd) {
        queue.offer(cmd);
        if (queue.size() > MAX_SIZE) queue.remove();//큐의 사이즈가 정한 MAX_SIZE보다 크면 맨 앞의 요소 제거함

    }
}
