package 브루마블;
// 두개의 주사위를 던져 12가 나오면 탈출하는 게임

public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0; //몇번만에 탈출했는지 숫자세기
        while(true) {
            cnt++;
            rand1 = (int) ((Math.random() * 6)+1);
            rand2 = (int) ((Math.random() * 6)+1);
            //(Math.random 실수가 떨어짐 0.1~5.9999..)+1 1.1~6.9999 int값해주면 정수만
            if((rand1 + rand2) ==12) {
                System.out.printf("무인도를 %d번 만에 탈출했습니다.\n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }
        }

    }
}
