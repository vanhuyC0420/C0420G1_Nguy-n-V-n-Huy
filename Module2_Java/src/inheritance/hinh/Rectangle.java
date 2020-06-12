package inheritance.hinh;

public class Rectangle extends objectHinhHoc{
    private double width;
    private double height;
    public Rectangle(){
        this.height=1.0;
        this.width=1.0;
    }
    public Rectangle(double height, double width){
        this.width=width;
        this.height=height;
    }
    public Rectangle(String color, boolean filler, double width, double height){
        super(color, filler);
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double widthh){
        this.width=widthh;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double heightt){
        this.height=heightt;
    }
    public double getArea(){
//        double area = 2.0;
        return width*height;
    }
    public double getPerimeter(){
//        double peri = 1.0;
        return 2*(width+height);
    }
    @Override
    public String toString(){
        return "A Rectangle with width = "+width+
                " height = " +height+
                ", area = " +getArea()+", perimeter = "+getPerimeter()+
                ", which is a subclass of " +
                super.toString();
    }

    public static void main(String[] args) {
        Rectangle hcn = new Rectangle();
        System.out.println(hcn);

        hcn = new Rectangle(4.4,5.5);
        System.out.println(hcn);

        hcn = new Rectangle("Blue",true,4.4,5.5);
        System.out.println(hcn);
    }
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
}
