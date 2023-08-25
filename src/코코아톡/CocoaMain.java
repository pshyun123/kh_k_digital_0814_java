package 코코아톡;

import 인터페이스기본.NetworkAdapter;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {

        CocoaTalk cocoaTalk = new CocoaTalk("곰사");
        cocoaTalk.writeMsg("잘잤어?");
        NetworkAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1]WiFi [2] 5G");
        int sel = sc.nextInt();
        if(sel == 1) adapter = new WiFi();
        else adapter =new FiveG();
        cocoaTalk.send(adapter);
    }
}
