package 커피메뉴만들기;

import 직렬화연습.Board;

import java.io.*;
import java.util.*;

//HashMap으로 커피 메뉴 리스트 만들기
public class CoffeeMenuList {

    //문자열로 만들어진 키와 커피의 여러가지 정보가 포함된 객체를 값으로 사용
    static Map<String, MenuInfo> map = new HashMap<>();//키값 하나로 클래스의 객체를 데려오자.

    public static void main(String[] args) {
        makeMenu(); //같은 클래스 안에서는 이름 생략가능. CoffeeMenuList.makeMenu();
        selectMenu();
    }

    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본커피"));
        map.put("Espresso", new MenuInfo("Espresso", 3000, "Coffee", "진한커피"));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유 포함"));
    }

    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key = ""; //초기화, 키를 받기위한 문자열 변수
        while (true) {
            System.out.println("=".repeat(10) + "메뉴 리스트" + "=".repeat(10));
            System.out.print("[1]메뉴 보기 [2]메뉴 조회 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1:
                    // map에서 key 가져와서 향상된 for문 수행
                    System.out.println("=".repeat(10) + "메뉴 보기" + "=".repeat(10));
                    for (String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getCategory());
                        System.out.println("설명 : " + map.get(e).getPrice());
                        System.out.println("-".repeat(28));
                    }
                    break;
                case 2:
                    System.out.print("조회 메뉴 입력 : ");
                    key = sc.next();
                    // 포함여부 확인하는 메소드: containsKey(key) : map 내에 해당 키가 있는지 확인하여 결과를 반환
                    if (map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).getName());
                        System.out.println("가격 : " + map.get(key).getPrice());
                        System.out.println("분류 : " + map.get(key).getCategory());
                        System.out.println("설명 : " + map.get(key).getDescription());
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                case 3:
                    System.out.print("추가 메뉴 입력 : ");
                    key = sc.next();
                    if (map.containsKey(key)) { //이미 메뉴가 존재하면 추가가 아님
                        System.out.println("해당 메뉴가 이미 존재");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();//띄어쓰기 있을 수 있어서
                        sc.nextLine();
                        System.out.println("설명 입력 : ");
                        String description = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, category, description));
                    }
                    break;
                case 4:
                    System.out.println("삭제할 메뉴를 입력 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + "메뉴 삭제 완료");
                    } else {
                        System.out.print("삭제할 메뉴가 없습니다. ");
                    }
                case 5:
                    System.out.print("수정할 메뉴 입력 : ");
                    key = sc.next();
                    if (map.containsKey(key)) { //이미 메뉴가 존재하면 추가가 아님
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        //키 값이 동일하고 값이 변경되는 경우에 replace() 사용
                        map.replace(key, new MenuInfo(key, price, category, description));
                    } else {
                        System.out.println("수정할 메뉴가 없음");
                    }
                    break;
                case 6:
                    System.out.println("메뉴 종료");
                    // 추가 > 메뉴 종료 시 직렬화, 메뉴종료되면 실행되도록 여기에 넣어주자!!! 강제 종료 구문 없애고.
                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;
                    try {
                        fos = new FileOutputStream("src/커피메뉴만들기/coffee.bin");
                        oos = new ObjectOutputStream(fos);
                        oos.writeObject(map);// 객체를 직렬화해서 파일에 저장하기
                        oos.flush(); // 버퍼지우기
                        oos.close(); // 출력을 위한 스트림의 자원 반납하고 닫기
                    } catch (IOException e) {
                    }
                    return; //종료해준다. break; 는 안됨. while 안에 있어서
                default:
                    System.out.println("선택하신 메뉴가 없습니다.");
            }
        }
    }
}








//CRUD :Create(생성), Read(읽기), Update(갱신), Delete(삭제)
//오라클 DB 사용해서 추석전 프로젝트 사용
//DB의 특성 : 영속성, 무결성
//