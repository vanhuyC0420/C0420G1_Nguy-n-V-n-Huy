package abstract_class_interface.bt2;

import abstract_class_interface.bt.Rectangle;

public class Square extends Rectangle implements Colorable{
    private double side;
    public Square() {
        this.side=1.0;
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(String color, boolean filler, double side) {
        super(color,filler,side,side);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setHeight(double length) {
        setSide(length);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Square hinhvuong = new Square();
        System.out.println(hinhvuong);

        hinhvuong = new Square(4.4);
        System.out.println(hinhvuong);

        hinhvuong = new Square("Yellow",true,4.4);
        System.out.println(hinhvuong);
    }

    @Override
    public void HowtoColor() {
        System.out.println("Color all four sides..");
//        return "Color all four sides..";
    }
}
