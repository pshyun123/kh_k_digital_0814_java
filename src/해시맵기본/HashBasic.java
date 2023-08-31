package 해시맵기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashBasic {
    public static void main(String[] args) {
        //key, value
        Map<String, Integer> map = new HashMap<>();
        //값을 객체 저장 : .put(key,value)
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 70); //같은 키로 간주해서 나중에 저장된 값으로 대체, key는 중복X, value는 중복가능
        //집합: set, 집합으로 동작하겠구나
        System.out.println("총 Entry 수 : " + map.size()); //entry를 key,value
        //중복된 키는 반영하지 않음(결과 값4)

        //객체 찾기 : get(key), 지정된 키에대한 값을 반환
        System.out.println(map.get("동그라미"));
        //map은 인덱스가 없음


        //향상된 for문으로 map 순회
        for (String key : map.keySet()) { //keySet() key가 포함된 Set 컬렉션 반환,
            //key 값을 가지고 순회, key가 set 개념. 중복허용 X,
            // map에 있는 key 값을 set 구조로 만들어냄
            //로또 할때 중복값 허용 없애려고 사용함
            System.out.println(key + "\t"+ map.get(key));
        }
        // iterator(반복자)를 사용하는 방법, 이해는 해야함
        Set<String> keySet = map.keySet(); //keySet이라는 참조변수
        Iterator<String> interator = keySet.iterator();
        while (interator.hasNext()) {
            String key = interator.next();
            Integer value = map.get(key);
            System.out.println(key + "\t" + value);
        }

        // 객체 삭제 : 키 값으로 해당 Entry 삭제
        map.remove("최수연");
        for (String key : map.keySet()) {
            System.out.println(key + "\t"+ map.get(key));
        }
        }
}
