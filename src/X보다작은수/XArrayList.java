package X보다작은수;
//첫째줄에 N, X 주어짐
//10 5
//1 10 4 9 2 3 8 5 7 6
//결과 : 1 4 2 3
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();//객체타입 Integer 넣어주고
        System.out.print("정수 입력: ");

        int n = sc.nextInt(); //배열의 갯수
        int x = sc.nextInt(); //크기를 비교하는 기준값 (미만 값을 찾기 위한)

        for(int i = 0; i < n; i++) { //n만큼 돌리면서 ++
            list.add(sc.nextInt()); //add : 리스트에 값 추가, 대입이 아니라
            if(list.get(i) < x) System.out.print(list.get(i) + " ");
        } // 배열 한번만 돌리기. 여기 주석달자
        System.out.println();

    }
}
