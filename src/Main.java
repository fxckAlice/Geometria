
public class Main {
    public static void main(String[] args) {
        Parallelogram ABCD = new Parallelogram();
        ABCD.setWidth(3);
        ABCD.setLeight(6);
        ABCD.setCorner(90);
        System.out.println(ABCD.round(3.156, 0));
    }
}