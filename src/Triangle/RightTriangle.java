package Triangle;

public class RightTriangle extends Triangle{
    @Override
    public void setHeight(double height) {
        System.out.println("Doesn't exist.");
    }

    @Override
    public void setHeightB(double heightB) {
        System.out.println("Doesn't exist.");
    }
    public void setCornerC(double cornerC) {
        System.out.println("90 degrees is constant.");
    }

}
