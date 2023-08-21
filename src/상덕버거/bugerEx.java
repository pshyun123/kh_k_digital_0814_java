package 상덕버거;
//문제 요약 : 햄버거 3개와 음료 두개를 연속으로 입력받아 햄버거중 가장 작은 값, 음료 2개중 작은 값을 찾음
//찾은 값을 더하고 세트메뉴이기에 -50원
import java.util.Scanner;

public class bugerEx {
    public static void main(String[] args) {
        //5개의 값을 입력받기 위해 배열의 자료형 생성
        int [] menu = new int[5]; //햄 3, 음 2
        //키보드 입력을 받기위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴를 입력하세요. : ");
        for (int i = 0; i <menu.length; i++)  menu[i] = sc.nextInt();{
            //연속으로 5번 입력받으니까 배열의 i번째에 입력
        }
        //기준값 : 햄버거는 0,1,2, 음료는 3,4
        int minBurger = menu[0]; // 햄버거 중에 제일 싼 메뉴 찾기 위한 시작값
        int minDrink = menu[3]; // 음료 중 제일 싼 메뉴 찾기 위한 시작값
        for(int i = 0; i < menu.length; i++){ //메뉴의 길이만큼 돌리면서 증감
            if((i < 3) && (minBurger > menu[i])) minBurger = menu[i]; // 현재의 메뉴값을 대입
            if((i > 2) && (minBurger > menu[i])) minDrink = menu[i];
            // i가 2보다 크면(3,4) 음료 가격이 메뉴에 i번째 가격과 비교해서 더 싼 메뉴 있으면 값을 현재..

            System.out.println(minBurger + minDrink -50);
        }

    }
}
