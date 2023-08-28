package 자동차만들기종합;

public class SportsCar extends SirCar{
    public SportsCar(String name) {
        this.name = name;
        maxSpeed = 200;
        fuelEff = 12;
        fuelTank = 45;
        seatCnt = 4;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) maxSpeed *= 1.2;
    }
}
