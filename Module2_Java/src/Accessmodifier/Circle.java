package Accessmodifier;

public class Circle {
    private static double radius = 1.0;
    private static String color = "red";
    final static double PI = 3.14159;

    Circle(){}
    Circle(double r){
        this.radius=r;
    }
    public double getRadius(){
        return this.radius;
    }

    public  String getColor(){
        return this.color;
    }

    public void setColor(String mau){
        this.color=mau;
    }

    public static double getArea(){
//        double area;
        return radius*radius*PI;
    }
    public void display(){
        System.out.printf("Diện tích hình tròn bán kính %f có màu %s = %f",getRadius(),getColor(),getArea());
    }
}
