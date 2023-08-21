package 문자열다루기;
// 자바는 문자열을 나타내는 자료형은 String이며, 참조타입 자료형
// equals : 두개의 문자열이 동일한지 비교하여 결과값을 리턴함 (true/false),
// == 문자열 주소가 같은지를 물어봄
// indexOf : 문자열에서 특정문자가 시작되는 인덱스를 반환
// contains : 문자열에서 특정문자가 포함되어 있는지 여부확인
// charAt : 문자열에서 특정위치의 문자를 반환
// replaceAll : 문자열 중에서 특정 문자열을 다른 문자열로 변경(정규식)
// substring: 문자열 중에서 특정부분을 뽐아 낼 때 사용(시작인덱스만 주는 경우와 시작과 끝 주는 경우 있음)
// toUpperCase / toLowerCase 문자열을 모두 대문자/소문자로 변경할 때 사용한다.
//trim : 문자열 앞뒤의 공백을 잘라냅니다.
//split : 문자열을 특정 구분자로 분리하는 메소드이다.

public class StringMethod {
    public static void main(String[] args) {
        String a = "hello java";
        String b = "java";
        String c = "Hello";
        String d = new String("hello");


        System.out.println(a.equals(d));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c)); //문자열을 비교하는데 대소문자 구분 안함
        System.out.println(a.indexOf("lt"));// 문자가 시작되는 인덱스 반환 , 없다(기본값) : -1,
        System.out.println(a.contains("java"));
        System.out.println(a.charAt(2));
        String e = "Hello java";
        System.out.println(e.replaceAll("java", "python...")); //
        System.out.println(e.substring(4,7)); //여기부터 그 이후 값 잘라서 보여줌 (4~6)
        System.out.println(e.toUpperCase()); //대문자
        System.out.println(a.toLowerCase()); //소문자
        String oldStr ="        자바 프로그래밍      ";
        System.out.println(oldStr.trim());
        String time = "10:23:45";
        String[] modifyTime = time.split(":");
        for(String eee : modifyTime) System.out.print(eee + " ");
//문자열 포매팅을 출력을 위해서 사요
        System.out.println();
        System.out.printf("I eat %d apples.\n", 3);
        String test = String.format("I eat %d apples.", 3); //위 아래가 동일한 값
        System.out.println(test);

        String testName = "James";
        char[] chName = testName.toCharArray();
        for(char eCh : chName) System.out.print(eCh + " ");
     }

}
