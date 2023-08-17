package 비트연산자;
//비트 연산자는 비트단위의 연산을 수행합니다.
//AND : & 비교하는 두개의 비트가 모두 1이어야 1이 됨
//OR : | 비교하는 두개의 비트가 한쪽만 1이면 1이 됨
//XOR : ^ 비교하는 두 비트가 서로 다른 경우만 1
//NOT: ~ 현재의 비트 값을 반전
//왼쪽 쉬프트 :<< 비트를 왼쪽으로 이동시킴
//오른족 쉬프트 : >>비트를 오른쪽으로 이동시킴
public class BitOperate {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1); //2의 보수때문에 1정도 차이가 난다.
        System.out.println(num1 << 1); //왼쪽으로 한비트 이동하면 *2의 값
        System.out.println(num1 >> 1); //오른쪽으로 한비트 이동하면 /2의 값
        System.out.println(num1 >> 1); //연습

    }
}
