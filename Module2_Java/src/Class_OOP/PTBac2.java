package Class_OOP;

import java.util.Scanner;

public class PTBac2 {
    int a, b, c;
//    double d;

    public PTBac2() {}

    public PTBac2(int x, int y, int z) {
        this.a = x;
        this.b = y;
        this.c = z;
//        this.d=p;
    }

    public double getDelta() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDelta())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDelta())) / (2 * this.a);
    }

    public double get1Root() {
        return -this.b / (2 * this.a);
    }

    public double getRoot(){
        double x;
        x = -this.c/this.b;
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập c: ");
        int c = scanner.nextInt();
        PTBac2 phuongtrinhb2 = new PTBac2(a,b,c);
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.print("Phương trình vô số nghiệm.");
                }else
                    System.out.print("Phương trình vô nghiệm.");
            }else
                System.out.println("Phương trình có nghiệm: "+phuongtrinhb2.getRoot());
        }else {
//            System.out.println("Chưa biết:");
            if (phuongtrinhb2.getDelta()<0)
                System.out.println("Phương trình vô nghiệm.");
            else if (phuongtrinhb2.getDelta()>0){
                System.out.printf("Phương trinh có nghiệm x1 = %f",phuongtrinhb2.getRoot1());
                System.out.printf("phương trình có nghiệm x2 = %f",phuongtrinhb2.getRoot2());
            }else
                System.out.printf("Phương trình có 1 nghiệm duy nhất x= %f",phuongtrinhb2.get1Root());
        }
    }
}
