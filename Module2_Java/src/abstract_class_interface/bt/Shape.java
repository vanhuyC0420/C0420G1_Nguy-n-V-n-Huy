package abstract_class_interface.bt;

public class Shape implements reSizeable {
    private String color;
    private boolean filler;
    public Shape(){
        this.color = "green";
        this.filler = true;
    }
    public Shape(String color, boolean filler){
        this.color = color;
        this.filler = filler;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color =color;
    }
    public boolean getFiller(){
        return this.filler;
    }
    public double getArea(){return 1;}
    public void setFiller(boolean filler){
        this.filler=filler;
    }
    @Override
    public String toString(){
        return "A Shape with color of "
                + getColor()
                + " and "
                + (getFiller() ? "filled" : "not filled");
    }


    @Override
    public void resize(double percent) {
        System.out.println("Chưa có gì cả!!!");
    }
}
