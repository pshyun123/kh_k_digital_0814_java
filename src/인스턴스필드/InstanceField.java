package 인스턴스필드;

public class InstanceField {
    public static void main(String[] args) {
        int val = 30; //지역변수
        FieldTest fieldTest1 = new FieldTest();//참조변수를 가지고 직접 접근
        fieldTest1.instanceVal = 200; // 각각의 개체마다 값을 다르게 설정가능
        FieldTest fieldTest2 = new FieldTest();
        fieldTest2.instanceVal = 300;

        FieldTest.classVal = 1000;//?
    }
}
