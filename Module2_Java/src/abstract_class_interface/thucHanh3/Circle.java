package abstract_class_interface.thucHanh3;

import abstract_class_interface.bt.Shape;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){}
    public Circle(double radiuss){
        this.radius=radiuss;
    }
    public Circle(double radiuss, String color, boolean filler){
        super(color, filler);
        this.radius = radiuss;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radiuss){
        this.radius=radiuss;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent){
        this.radius +=radius*(percent/100);
//        System.out.println();
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle=new Circle(3.5,"white",false);
        System.out.println(circle);

        circle = new Circle(5.5);
        System.out.println(circle);
    }
}
