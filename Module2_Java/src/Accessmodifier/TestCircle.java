package Accessmodifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        circle.getRadius();
//        circle.getArea();
        circle.getColor();
        circle.setColor("Vàng");
//        circle.display();
        System.out.printf("Circle có màu %s \nDiện tích = %f",circle.getColor(),circle.getArea());
    }
}
