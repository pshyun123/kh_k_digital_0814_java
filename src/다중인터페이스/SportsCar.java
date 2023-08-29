package 다중인터페이스;


public class SportsCar extends NewCar implements AirCon, AutoDrive {
    private boolean isAirCon;
    private int setTemp;
    private boolean isAutoDrive;
    private int speed;
    private String color;
    private String year;
    private boolean isTurbo;

    public SportsCar(boolean isAirCon, int setTemp, boolean isAutoDrive, int speed, String color, String year, boolean isTurbo) {
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrive = isAutoDrive;
        this.speed = speed;
        this.color = color;
        this.year = year;
        this.isTurbo = isTurbo;
    }


public void viewInfo(){
    String airConStr = (isAirCon) ? "ON" : "OFF";
    String autoStr = (isAutoDrive) ? "ON" : "OFF";
    String turboStr = (isTurbo) ? "ON" : "OFF";
    System.out.println("속도 : " + speed);
    System.out.println("색상 : " + color);
    System.out.println("제작연도 : " + year);
    System.out.println("에어컨 : " + airConStr);
    System.out.println("에어컨 온도 : " + setTemp);
    System.out.println("자율 주행 : " + autoStr);
    System.out.println("터보 모드 : " + turboStr);
}

    @Override
    public void airConON() {

    }

    @Override
    public void airConOFF() {

    }

    @Override
    public void setAirConTemp(int tmp) {

    }

    @Override
    public void autoDryON() {

    }

    @Override
    public void autoDryOFF() {

    }
}