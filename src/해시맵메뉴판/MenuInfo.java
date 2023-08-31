package 해시맵메뉴판;

import java.util.Map;

public class MenuInfo {
    String name;      //메뉴명
    int price;          //가격
    String category;    //분류
    String description; //메뉴 설명

    public MenuInfo(String name, int price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }
}
