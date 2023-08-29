package Arrays검색;

import java.util.Arrays;
import java.util.Scanner;
// 검색 위해서는 사전에 정렬이 되어 있어야
public class ArraysSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("배열의 갯수: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("찾을 수를 입력 : ");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * num) + 1;
        }
        Arrays.sort(arr);
        for (int val : arr) System.out.print(val + " ");
        System.out.println();//줄바꿈
        int result = Arrays.binarySearch(arr, key);//정렬된 배열을 이분검색
        if (result >= 0) {
            System.out.println(result);//인덱스가 넘어옴. 값이
        } else {
            System.out.println("찾는 값이 없습니다.");
        }
    }
}