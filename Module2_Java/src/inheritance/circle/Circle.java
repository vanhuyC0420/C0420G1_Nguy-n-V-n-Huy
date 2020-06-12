package inheritance.circle;

public class Circle {
    private double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double radiuss){
        this.radius=radiuss;
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
        return "Hình tròn bán kính = "+radius+
                ",\ndiện tích = "+getArea()+
                ",\nchu vi = "+getPerimeter();
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);

        circle= new Circle(3.5);
        System.out.println(circle);
    }
}
