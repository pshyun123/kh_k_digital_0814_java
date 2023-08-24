package 다차원배열;
// 2차원 배열에서 행에 대한 배열의 값을 실제 값이 존재하는 것이 아니고
// 열에 대한 시작주소를 가지고 있음
public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; //0번 인덱스에서 0,1,2 //1번 인덱스에서도 0,1,2
        int k = 10;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {

                arr[i][j] = k; //이게 실제 값
                k += 10;

                //arr자체도 주소. 주소가 두번 넣어져야 실제 값이
            }
        }
//향상된 for문, ints도 엘리먼트, 주소
        for(int[] ints : arr) {
            for(int e : ints) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
//00