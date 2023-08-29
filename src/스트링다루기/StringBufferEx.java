package 스트링다루기;
//StringBuffer(동기화 지원), StringBuilder(동기화 지원X). 둘다 문자열을 추가하거나 변경할 때 사용, 락이 있고 없고
// String 자료형과 어떤 차이가 있는지 이해하면됨
public class StringBufferEx {
    public static void main(String[] args) {
//======스트링버퍼나 빌더 사용========
        StringBuffer sb = new StringBuffer(); //빌더나 버퍼나 똑같음
        sb.append("hello");
        sb.append(" ");
        sb.append("java");
        System.out.println(sb);

//======스트링 사용========
        String st = ""; // 초기화 됨. 실제로 보면 원래 객체타입인데, 내부적으로는 래퍼가 기본타입으로 간주. 문자열에 값이 없다고 오토캐스팅함
        // String st = null; // 이렇게 초기화 해도 됨. 주소가 없구나~
        // 내부적으로 두가지 기능을 같이 함. 스트링은 원래 참조타입. 우리가 기본타입처럼 사용하고 있음.

        st += "hello";//복합대입연산자; 문자를 이어 붙이기.기존의 내문자에다가 다른 문자 더해서 다시 나에게 대입
        st +=" ";
        st += "java";
        System.out.println(st);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("jump to java");
        //insert : 해당 offset에 문자열 추가
        //        sb2. insert(0,"hello ") ;
        System.out.println(sb2);
        sb2.delete(7,10); //범위 지정
        System.out.println(sb2.substring(0,4));
    }

    //내부 동작의 차이만 있고 두개가 같은 값 도출
    //하나의 주소에다가 게속 추가하는게 스프링버퍼, 문자열 길이 긴 경우엔 스트링버퍼가 이득
    //스트링은 다 각각의 주고 값에 할당, 짧은 경우엔 스트링이 이득
}
