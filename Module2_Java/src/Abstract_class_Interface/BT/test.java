package Abstract_class_Interface.BT;

public class test {
    public static void main(String[] args) {
//        Shape rectangle = new Rectangle(2,3);
//        System.out.println(rectangle.getArea());
//        rectangle.resize(10);
//        ((Rectangle) rectangle).resize(10);
        Shape circle = new Circle();
        System.out.println("Diện tích hình tròn = " +circle.getArea());
//        System.out.println(circle.getArea());
//        System.out.println(circle.reSize(25));
//        System.out.println(circle.reSize(25));
        circle.resize(25);
//        ((Circle) circle).resize(25);
        System.out.println("Bán kính sau thay đổi: "+circle);
//        System.out.println("Diện tích sau thay đổi r = "+circle.getArea());
//        Square hinhvuong = (Square) new Rectangle(4,5); // sai
        Rectangle hinhvuong = new Square(5);
        System.out.println(hinhvuong.getArea());
    }
}
