
public class Main {
    public static void main(String[] args) {
        Figure ABCD = new Square();
        //ABCD.setWidth(3);
        ABCD.setLeight(1);
        System.out.println(ABCD.round(ABCD.diagonal(), -2));
    }
}