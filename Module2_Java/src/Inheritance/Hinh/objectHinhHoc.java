package Inheritance.Hinh;

public class objectHinhHoc {
    private String color;
    private boolean filler;
    public objectHinhHoc(){
        this.color = "green";
        this.filler = true;
    }
    public objectHinhHoc(String color,boolean filler){
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
}
