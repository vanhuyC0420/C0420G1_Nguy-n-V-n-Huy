package Inheritance.movePoint;

public class point {
    private float x;
    private float y;
    public point(){
        x=0.0f;
        y=0.0f;
    }
    public point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x1){
        this.x=x1;
    }
    public float getY(){
        return this.y;
    }
    public void setY(float y1){
        this.y=y1;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float arr[]= {this.x,this.y};
        return arr;
    }
    @Override
    public String toString(){
        return "Toạ độ x = "+this.getXY()[0]+".\t toạ độ y = "+this.getXY()[1];
    }

    public static void main(String[] args) {
        point point1 = new point();
        System.out.println(point1);
    }
}
