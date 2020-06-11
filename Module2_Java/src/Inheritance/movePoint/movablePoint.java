package Inheritance.movePoint;

import java.util.Arrays;

public class movablePoint extends point {
    private float xSpeed;
    private float ySpeed;
    public movablePoint(){
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }
    public movablePoint(float xSpeed1,float ySpeed1){
        this.xSpeed=xSpeed1;
        this.ySpeed=ySpeed1;
    }
    public movablePoint(float a,float b, float c, float d){
        super(a,b);
        this.xSpeed=c;
        this.ySpeed=d;
    }
    public float getxSpeed(){
        return this.xSpeed;
    }
    public void setxSpeed(float xx){
        this.xSpeed=xx;
    }
    public float getySpeed(){
        return this.ySpeed;
    }
    public void setySpeed(float yy){
        this.ySpeed=yy;
    }
    public void setSpeed(float xx, float yy){
        this.xSpeed=xx;
        this.ySpeed=yy;
    }
    public float[] getSpeed(){
        float speed[] = {xSpeed,ySpeed};
        return speed;
    }
    public void move(){
        this.setX(this.getY()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
    }
    @Override
    public String toString(){
        return super.toString()+"\n x Speed = "+ xSpeed+
                "\n y Speed = "+ySpeed+
                "\n arraySpeed = "+ Arrays.toString(getSpeed());
    }

    public static void main(String[] args) {
        movablePoint mv = new movablePoint(1,2,3,4);
        System.out.println(mv);
        mv.move();
        System.out.println(mv);
    }
}
