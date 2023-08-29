package 다중인터페이스;

public interface AirCon {
    //설계도면에 가이드 넣는 느낌
    int Max_TEMP = 30; // public final static
    int MIN_TEMP = 0;//

    void airConON();

    void airConOFF();

    void setAirConTemp(int tmp);
}
