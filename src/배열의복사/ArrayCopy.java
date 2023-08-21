package 배열의복사;

import java.util.Arrays;

//이해만 간단히 하고 넘어가도 괜찮음. 중요X
//자바의 배열은 한번 선언하면 크기를 변경할 수 없음
//배열의 크기를 변경하기 위해서는 더 큰 배열을 만들고 기존 배열의 데이터를 옮겨 담아야 한다.
//array list 쓰는게 더 나음
//arraycopy() :System.arraycopy(Object src, int srcPos(시작위치), Object dest(목적지), int destPos, int length);
//copyOf()배열을 원하는 길이 만큼 새로운 배열로 복사
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
//        int newlen = 10;
//        int[] arr2 = new int[newlen];
//        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//        for(int e : arr2) System.out.print(e + " ");
        int[] arr3 = Arrays.copyOf(arr1,10);
        for(int e :  arr3) System.out.print(e + " ");
    }
}
