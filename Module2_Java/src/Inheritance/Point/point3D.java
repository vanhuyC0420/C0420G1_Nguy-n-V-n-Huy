package Inheritance.Point;

public class point3D extends point2D {
    private float z;
//    private float ySpeed;
    public point3D(){
        z=0.0f;
    }
    public point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z1){
        this.z=z1;
    }
    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    public double[] getXYZ(){
        double[] arr={this.getX(),this.getY(),this.z};
        return arr;
    }
    @Override
    public String toString(){
        return "Toa do X: "+this.getXYZ()[0]+", Toa do Y: "+ this.getXYZ()[1]+", Toa do Z: "+ this.getXYZ()[2];
    }

    public static void main(String[] args) {
        point3D poit = new point3D(2,3,4);
        System.out.println(poit);
        poit.setXYZ(2,4,6);
        System.out.println(poit.toString());
        point2D poit1 = new point2D(1,2);
        System.out.println(poit1.toString());
    }
}
