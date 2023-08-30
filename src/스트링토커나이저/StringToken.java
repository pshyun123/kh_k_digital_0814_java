package 스트링토커나이저;
//문자열이 특정 문자열로 연결되어 있는 경우, 구분자를 기준으로 자르는 것. (부분 문자열로 만듦)
// countTokens() : 꺼내지 않고 남아 있는 토큰의 수
// hasMoreTokens() : 남아 있는 토큰이 있는지 여부확인
// nextToken() : 토큰 하나씩 꺼내옴
import java.util.Scanner;
import java.util.StringTokenizer;

//split()과 용도가 같음
public class StringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력하세요 : ");
        String names = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(names, "/");
//        String[] nameStr = new String[st.countTokens()];
//        int idx = 0;
//        //남아있는 토큰 수를 몰라서
//        while (st.hasMoreTokens()){
//            nameStr[idx++] = st.nextToken(); //토큰 하나씩 꺼내서 배열에 넣음
//        }
//
//        //스플릿으로
//        String[] nameStr = names.split("/");
//        for(String e : nameStr) System.out.println(e + " ");
        String s = new String();
        Class c = s.getClass();
        System.out.println(c);
    }
}
