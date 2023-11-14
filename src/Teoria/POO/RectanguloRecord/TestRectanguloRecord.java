package Teoria.POO.RectanguloRecord;

public class TestRectanguloRecord {
    public static void main(String[] args) {
        RectanguloRecord rectanguloRecord = new RectanguloRecord(2, 3);
        System.out.println(rectanguloRecord);
        System.out.println("alto: " + rectanguloRecord.alto());
    }
}
