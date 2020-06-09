package Inheritance.circle;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        height=1.0;
    }
    public Cylinder(double heightt){
        this.height=heightt;
    }
    public Cylinder(double radius,double heightt){
        super(radius);
        this.height=heightt;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double heightt){
        this.height=heightt;
    }
    public double getVolume(){
        return super.getRadius()*getRadius()*Math.PI*height;
    }
    public double getSidelArea(){
        return 2*super.getRadius()*Math.PI*height;
    }
    public double getTotalArea(){
        return 2*(super.getRadius()*getRadius()*Math.PI)+this.getSidelArea();
    }
    @Override
    public String toString(){
        return "Hình trụ có đáy hình tròn bán kính = "+super.toString()+
                ",\nchiều cao = "+height+
                ",\ndiện tích xung quanh = "+getSidelArea()+
                ",\ndiện tích toàn phần = "+getTotalArea()+
                ",\nthể tích = "+getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        System.out.println("HÌNH TRỤ THỨ 2:  ");
        cylinder=new Cylinder(2,2);
        System.out.println(cylinder);
    }
}
