package Inheritance.BT2sao;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        side3=1.1;
        side2=1.2;
        side1=1.3f;
    }
    public Triangle(double s1, double s2, double s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    public Triangle(String color, boolean filled, double s1, double s2, double s3){
        super(color, filled);
        this.side1 = s1;
        this.side3 = s3;
        this.side2 = s2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }
    public double getArea(){
        return Math.sqrt((getHalfParameter()-getSide1())*(getHalfParameter()-side2)*
                (getHalfParameter()-side3)*getHalfParameter());
    }
    public double getHalfParameter(){
        return (getSide1()+getSide2()+getSide3())/2;
    }
    public double getParameter(){
        final double v = getSide1() + side2 + getSide3();
        return v;
    }

    @Override
    public String toString() {
        return "Triangle có 3 cạnh = "+this.side1+
                ", "+this.side2+
                ", "+this.side3+
                ", \ndiện tích = "+getArea()+
                ", \nchu vi = "+getParameter()+super.toString();
    }
}
