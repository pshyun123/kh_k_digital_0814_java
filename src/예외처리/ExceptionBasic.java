package 예외처리;
//"배열이 인덱스를 초과함. 값을 확인해주세요."
public class ExceptionBasic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
        for (int i = 0; i <= 5; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("배열이 인덱스를 초과함. 값을 확인해주세요.");
        }
        System.out.println("프로그램 정상종료");
    }
}