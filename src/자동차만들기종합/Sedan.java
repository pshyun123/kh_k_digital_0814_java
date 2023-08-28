package 자동차만들기종합;

public class Sedan extends SirCar{
    public Sedan(String name) {
        this.name = name;
        maxSpeed = 200;
        fuelEff = 12;
        fuelTank = 45;
        seatCnt = 4;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1 ;//s넣어줘야함


    }
}
