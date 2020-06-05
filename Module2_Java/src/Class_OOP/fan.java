package Class_OOP;

public class fan {
    final int SLOW = 1;
    final int FAST = 3;
    final int MEDIUM = 2;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    private int speed;

    public fan() {
        this.speed = SLOW;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int sped) {
        this.speed = sped;
    }

    public boolean getON() {
        return this.on;
    }

    public void setON(boolean oon) {
        this.on = oon;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String coloo) {
        this.color = coloo;
    }

    //    @Override
    public String toSring() {
        return "Speed: " + this.speed + ";\n Status: " + this.on + ";\n Radius:" +
                " " + this.radius + ";\n Color: " + this.color;
    }

    //    public class ObjectFanFan {
    public static void main(String[] args) {
        fan fanfan = new fan();
        System.out.printf("Thông số mặc định của quạt: %s \n",fanfan.toSring());
        fan fan1=new fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setON(true);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        System.out.println("Thông số của cái quạt thứ 2: \n"+fan1.toSring());
        fan fan2 =new fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setON(false);
        fan2.setRadius(7.5);
        fan2.setColor("Blue");
        System.out.printf("%s",fan2.toSring());
    }
//    }
}
