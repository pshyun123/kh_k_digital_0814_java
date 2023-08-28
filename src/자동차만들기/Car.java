package 자동차만들기;

public class Car {

    int speed;       //속도
    int fuelE;       //연비
    int fuelTank;    //연료탱크
    int seat;         //좌석수
    int seatCount;    //승객수
    String name;     //차이름
    int area;        //이동거리
    boolean isExtra;  //부가기능
    int totalC;      //이동횟수
    int totalD;      //총이동거리
    int cost;        //비용
    int refill;      //주유횟수
    String time;        //시간

    Car(String name) {

        this.name = name;
    }
    public void setTotalC() {
        totalC = seatCount / seat;
        if (seatCount % seat > 0) totalC += 1;
    }

    public void setArea(int area) {
        switch (area) {  //지역마다 거리수
            case 1:
                this.area = 400;
                break;
            case 2:
                this.area = 200;
                break;
            case 3:
                this.area = 150;
                break;
            case 4:
                this.area = 300;
                break;
        }
    }
    //총거리
    public void setTotalD() {
        totalD = totalC*area;
    }

    //주유횟수 = (총이동거리 / 연비) 연료탱크
    public void setRefill() {
        //a = (총거리 / 연비)
        int a = totalD % fuelE;

        if (a > 0) a = (totalD / fuelE) + 1;
        else a = totalD / fuelE;
        if(a % fuelTank> 0) {
            refill = (a / fuelTank) + 1;
        }else refill = a /= fuelTank;
    }

    //총비용
    public void setcost() {
        cost = (totalD / fuelE) * 2000; //비용
        if (totalD % fuelE > 0) cost += 2000; //나머지가 생기면 2천원을 더해줌
    }

    public void setTime() {
        int hour = totalD /speed; //시간 = 총거리/속도
        int left = totalD - (speed * hour); //남은거리
        double leftMin = ((double)left / speed) *100 + 1;//+1안해주면 숫자가 하나 작게 나올수도 있어서(Math.random)
        int min = (int)((leftMin * 60 / 100)); //분, 소수점이 나와서 더블로 받고
        time = hour + "시" + min + "분";
        System.out.println(min);
    }
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    //INFO
//====== 관광버스 ======
//        총 비용 : 160000원
//        총 주유 횟수 : 1회
//        총 이동 시간 : 2.67
    public void getInfo() {
        System.out.println("=".repeat(5) + name + " " + "=".repeat(5));
        System.out.println("총 비용 : " + cost + "원");
        System.out.println("총 주유횟수 : " + refill + "회");
        System.out.println("총 이동시간 : " + time);
    }
}
class SportsCar extends Car {
    SportsCar(String name) {
        super(name);
        this.speed = 250;
        this.fuelE = 8;
        this.fuelTank =30;
        this.seat = 2;
    }
    public void isExtra(boolean isExtra){//스포츠카 부가기능
        if(isExtra) speed = (speed * 120 /100);
    }
}
class Bus extends Car {
    Bus(String name) {
        super(name);
        this.speed = 150;
        this.fuelE = 5;
        this.fuelTank = 100;
        this.seat = 20;
    }
    public void isExtra(boolean isExtra) { //버스 부가기능
        if (isExtra) seat += 1;
    }
}
class Sedan extends Car {
    Sedan(String name) {
        super(name);
        this.speed = 200;
        this.fuelE = 12;
        this.fuelTank = 45;
        this.seat = 4;
    }

    public void isExtra(boolean isExtra) {//세단 부가기능
       this.isExtra = isExtra;
        if (isExtra) fuelTank += 1;
        }
    }

