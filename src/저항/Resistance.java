package 저항;

import java.util.Scanner;
// 저항값 구하기 : 컬러 문자열 2개를 입력받음
// 첫번째 컬러 문자열은 10의 자리 수
// 두번째 컬러 문자열은 1의 자리수
// 세번째 컬러 문자열은 곱하는 수
public class Resistance {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int frt = 0 , sec = 0, thd = 0;
        Scanner sc = new Scanner(System.in);
        String frtColor = sc.nextLine();
        String secColor = sc.nextLine();
        String thdColor = sc.nextLine();
        for (int i = 0; i < color.length; i++) {
            if (frtColor.equals(color[i])) frt = i; // 첫번째 입력받은 컬러 문자열의 인덱스 값을 구함(10의 자리 값)
            if (secColor.equals(color[i])) sec = i; // 두번째 입력받은 컬러 문자열의 인덱스 값을 구함(1의 자리 값)
            if (thdColor.equals(color[i])) sec = i; // 세번째 입력받은 컬러 문자열의 인덱스 값을 구함(곱하는 수)
        }
        System.out.println((long) ((frt * 10) + sec) * (long)(Math.pow(10,thd)));
        //곱하기는 10의 자리 만들려고, 거기에 1의자리값 더해줌/ Math.pow는 거듭 제곱값을 구해줌
    }
}
        //        int[] mul = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
//        int fVal = 0, sVal = 0, tVal = 0;
//        Scanner sc = new Scanner(System.in);
//        String fColor = sc.nextLine();
//        String sColor = sc.nextLine();
//        String tColor = sc.nextLine();
//        for (int i = 0; i < 10; i++) {
//            if(fColor.equals(color[i])) fVal = i;
//            if(sColor.equals(color[i])) sVal = i;
//            if(tColor.equals(color[i])) tVal = mul[i];
//        }
//        System.out.println((long)((fVal * 10) + sVal)* tVal);//long으로 바꾼이유, 값이 커져서
//    }
//}
//        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
//        int firstIdx = 0, secondIdx = 0, thirdIdx = 0;
//        Scanner sc = new Scanner(System.in);
//        String firstColor = sc.nextLine();
//        String secondColor = sc.nextLine();
//        String thirdColor = sc.nextLine();
//        for(int i = 0; i <10; i++) {
//            if(firstColor.equals(color[i])) firstIdx = i;
//            if(secondColor.equals(color[i])) secondIdx = i;
//            if(thirdColor.equals(color[i])) thirdIdx = i;
//         }
//        System.out.println((long)((firstIdx * 10) + secondIdx) * (long)(Math.pow(10,thirdIdx)));
//    }
//}