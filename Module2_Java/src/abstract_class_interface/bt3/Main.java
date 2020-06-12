package abstract_class_interface.bt3;

public class Main extends Shape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.howToColor();

        Circle circle = new Circle();
        circle.howToColor();

        Rectangle circle1 = new Square();
        circle1.howToColor();

        Rectangle rectangle = (Rectangle) new Shape();// Không lỗi nhưng không chạy được.
    }
}
