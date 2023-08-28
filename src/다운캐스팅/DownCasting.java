package 다운캐스팅;

import java.util.ArrayList;
import java.util.List;

//상위 클래스형으로 변환되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것을 말함.
public class DownCasting {
    List<Animal> aniList = new ArrayList<>();
    //어레이 리스트 만들기. 어레이리스트는 자동으로 크기가 확장
    //정수 넣듯이 Animal을 넣음. 정수 같은 기본타입은 못 오고 객체타입만 올 수 있음
    //주소타입만 들어감
    public static void main(String[] args) {
     DownCasting downCasting = new DownCasting();
     downCasting.addAnimal();//불러옴
     downCasting.testCasting();
    }
    public void addAnimal() {//객체가 인스턴스화, arraylist 안에 하나의 객체주소가 들어감
        aniList.add(new Animal());
        aniList.add(new Tiger());//주소 설정됨
        aniList.add(new Eagle());
        for(Animal ani : aniList){//향상된 for문.
            ani.move();;
        }
    }
    public void testCasting() {
        for(int i = 0; i <aniList.size(); i++) {
            Animal ani = aniList.get(i); //0번째 객체 가져와서... 업캐스팅
            if (ani instanceof Human) { //ani(객체)와 hunman(클래스)이 human형으로 다운캐스팅 되는지 확인//조건이 참이면
                //부모자식, 부모부모, 자식자식만 가능한데 자식-부모여도 원래 형이 무엇이었나 맞으면 돌려줌
                Human h = (Human) ani;
                h.readBook();//원래 자기 자신의 클래스에 대한 참조 변수이기에 접근가능함.
            } else if(ani instanceof Tiger) { //형변환 바로 해줌
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if(ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();

            } else {
            System.out.println("지원되지 않음");
        }
    }
 }
}


