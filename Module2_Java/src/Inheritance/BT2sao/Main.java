package Inheritance.BT2sao;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("đỏ",false);
        System.out.println(shape.toString());
        Shape shape1 = new Triangle();
        System.out.println(shape1.toString());
        Triangle shape2 = new Triangle(2.2,2.3,2.4);
        System.out.println(shape2.toString());
        System.out.printf("Hình tam giác có 3 cạnh: %f,%f,%f: Diện tích = %f ",
                shape2.getSide1(),shape2.getSide2(),shape2.getSide3(),shape2.getArea());
        System.out.println();
        Triangle triangle = new Triangle("Vàng",true,3,4,5);
        System.out.println(triangle.toString());
    }
}
