
public class Main {
    public static void main(String[] args) {
        Parallelogram ABCD = new Rhombus();
        //ABCD.setWidth(3);
        ABCD.setLeight(6);
        //ABCD.setCorner(90);
        System.out.println(ABCD.round(ABCD.area('c'), -2));
    }
}