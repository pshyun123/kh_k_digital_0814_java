package 컴페어러블;

//제네릭 타입 걸고 타입 제한 걸고 CarComp를 비교.
public class CarComp implements Comparable<CarComp> {
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    //반환값이 1이면 정렬해야할 조건
    //반환값이 -1이면 정렬조건이 아님
    //반환값이 0 정렬조건은 아니지만 set 사용하는 경우 중복제거 조건이 됨
    public int compareTo(CarComp o) {//자기자신과 매개변수
        if(this.modelYear > o.modelYear) return 1; //연식으로 오름차순 정렬

        else {
            if(this.modelYear==o.modelYear){
                return this.color.compareTo(o.color);//사전 순 정렬
            }
        }
        return -1;
    }
}
