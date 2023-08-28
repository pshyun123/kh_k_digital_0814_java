package 자동차만들기종합;
//상속을 주기위한 Car Class 생성
public abstract class SirCar {
    protected int maxSpeed; //protected 접근 제한자는 상속관계, 같은 패키지에서 접근가능
    protected int fuelEff; //연비 (리터당 주행거리km)
    protected int fuelTank; //연료탱크 크기
    protected int seatCnt; //좌석수
    protected String name; //자동차이름

    abstract void setMode(boolean inMode);//abstract 왜 붙인다구? //상속받은 각각의 자동차의 특수기능

    public String getName() {
        return name;
    }

    //총 이동횟수
    int getMoving(int passCnt) { //입력값으로 승객수 필요
        //승객수/좌석수
        if (passCnt % seatCnt != 0) return (passCnt / seatCnt) + 1;

        return passCnt / seatCnt;
    }

    //총 주유 횟수
    int getRefuelCnt(int dist, int moveCnt) {//이동거리와 이동횟수를 매개변수로 전달 받음.
        if (((dist * moveCnt) / fuelEff) % fuelTank != 0) return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        return  ((dist * moveCnt) / fuelEff) / fuelTank;
    }

//총 이동 비용
int getTotalCost(int dist, int moveCnt) {
//    double disCost = (double) dist/fuelEff*2000;
//    return (int)(disCost *moveCnt); // 이게 더 정확
    return dist / fuelEff * 2000 * moveCnt;
    }
    //총 소요시간
    String getMovingTime(int dist, int moveCnt) {
        double getTime = (double) dist * moveCnt / maxSpeed;
        int totalMinute = (int) (getTime * 60);
        int hour = totalMinute / 60;
        int minute = totalMinute % 60;
        return String.format("%d시간 %d분", hour, minute);
        }
    }
