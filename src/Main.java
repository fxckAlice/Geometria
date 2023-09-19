
public class Main {
    public static void main(String[] args) {
        Figure ABCD = new Figure();
        ABCD.setWidth(3);
        ABCD.setleight(1);
        System.out.println(ABCD.diagonal());
        System.out.println(ABCD.round(ABCD.diagonal(), -2));
    }
}