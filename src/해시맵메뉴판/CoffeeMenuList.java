package 해시맵메뉴판;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
            switch (selMenu){
                case 1 :
                    //향상된 for문 사용
                    System.out.println("=".repeat(10) + "메뉴 보기" + "=".repeat(10));
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).category);
                        System.out.println("설명 : " + map.get(e).price);
                        System.out.println("-".repeat(28));
                    }
                    break;
                case 2 :
                    System.out.print("조회 메뉴 입력 : ");
                    key = sc.next();
                    // 포함여부 확인하는 메소드: containsKey(key) : map 내에 해당 키가 있는지 확인하여 결과를 반환
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).category);
                        System.out.println("설명 : " + map.get(key).description);
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                case 3 :
                    System.out.print("추가 메뉴 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)) { //이미 메뉴가 존재하면 추가가 아님
                        System.out.println("해당 메뉴가 이미 존재");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();//띄어쓰기 있을 수 있어서
                        sc.nextLine();//아까 왜 오류난거지??
                        System.out.println("설명 입력 : ");
                        String description = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, category, description));
                    }
                    break;
                case 4 :
                    System.out.println("삭제할 메뉴를 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                        map.remove(key);
                        System.out.println(key + "메뉴 삭제 완료");
                    } else {
                        System.out.print("삭제할 메뉴가 없습니다. ");
                    }
                case 5 :
                    System.out.print("수정할 메뉴 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)) { //이미 메뉴가 존재하면 추가가 아님
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
                case 6 :


                    System.out.println("메뉴 종료");
                    System.exit(0); //해줘도 가능(강제종료) ,return;도 같음
                default:System.out.println("선택하신 메뉴가 없습니다.");
            }
        }
    }
}
//CRUD :Create(생성), Read(읽기), Update(갱신), Delete(삭제)
//오라클 DB 사용해서 추석전 프로젝트 사용
//DB의 특성 : 영속성, 무결성
//