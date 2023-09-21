
public class Main {
    public static void main(String[] args) {
        Parallelogram ABCD = new Parallelogram();
        ABCD.setWidth(3);
        ABCD.setLeight(3);
        ABCD.setCorner(60);
        System.out.println(ABCD.round(ABCD.outRadius(), -2));
        //System.out.println(Math.cos((double) (180 - 60) / 90 * Math.PI));
        //System.out.println(Math.cos((double) 60 / 90 * Math.PI));
    }
}