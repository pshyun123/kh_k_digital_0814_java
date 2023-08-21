package 중복없는로또번호;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

// 1~ 45 사이의 임의의 수 6개를 생성(입력은 받지 않음, Math./random() => 0.1 ~ 8.999
// 단 중복제거
// 배열 6개
// 반복횟수는 정할 수 없음(while(true)
// ==> 탈출조건 있어야 함(중복되지 않은 번호가 6개가 저장되면 break)
public class RandomLotto {
    public static void main(String[] args) {

        //Set : 자바에서 사용하는 집합개념
            HashSet<Integer> set = new HashSet<>(); //담았다가 빼내면 중복 값 사라짐
            while(true) {
                int tmp = (int) ((Math.random()*45 +1));
                set.add(tmp);
                if(set.size() == 6) break;
            }
            System.out.println(set);

//        List<Integer> list = new ArrayList<>(); //개체 타입만 올 수 있음, 메모리 체계가 같아야함
//        int tmp;
//        while(true) { //중복된 번호가 얼마나나올지 모르니까
//            tmp = (int) ((Math.random() * 45 + 1));
//            if (!list.contains(tmp)) {//리스트내에 존재하지 않으면 아래의 값 넣고 아니면 넘어감
//                list.add(tmp);
//            }
//            if (list.size() == 6) break; //커진크기가 6개가 되면 빠져나오자
//        }
//        System.out.println(list);












//        //배열 쓰고
//        int[] lotto = new int[6];
//        int tmp, index = 0; //임시로또번호 몇번만에 로또번호 만들지 모르니까
//        boolean isExist = false;
//
//        while (true) {
//            tmp = (int) ((Math.random() * 45 + 1));//임시 로또번호 1을 더한 이유: 0보다 크게 하려고
//            for (int i = 0; i < lotto.length; i++) {
//                if (lotto[i] == tmp) isExist = true;//0~5까지 돌면서 중복된 값이 있다.
//            }
//            if (!isExist) lotto[index++] = tmp;//존재하지 않았고 중복이 되지 않았을때
//            if (index == 6) break;
//            isExist = false;//혹시 중복된 값있을까봐
//        }
//        for (int e : lotto) System.out.print(e + " ");
    }
}

//
//        int val, index = 0;
//        boolean isExist = false;
//        while(true) {
//            val = (int)(Math.random() * 45) + 1; //
//            for (int i = 0; i <6; i++) {
//                if (lotto[i] == val) isExist = true;
//            }
//            if(!isExist) lotto[index++] = val;
//            if(index==6) break;
//            isExist = false;
//            }
//        for(int i = 0; i < 6; i++){
//            System.out.print(lotto[i] + " ");
//        }
//
//        System.out.println();
//    }
//}
