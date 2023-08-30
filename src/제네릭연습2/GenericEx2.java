package 제네릭연습2;

public class GenericEx2 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();//재료를 넣을거고, 파우더 넣으면 파우더프린터
        powderPrinter.setMaterial(new Powder()); //
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);
    }
}
