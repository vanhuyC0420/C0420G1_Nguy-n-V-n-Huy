package Introduction.ThucHanh;

import java.util.Scanner;

public class GiaiptBac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        double a = scanner.nextDouble();
        System.out.println("b = ");
        double b = scanner.nextDouble();
//        System.out.println("c = ");
//        double c = scanner.nextDouble();  2 dòng khai báo biến c này không cần thiết
        if (a!=0){
            double solution = -b/a;
            System.out.printf("solution of equation = %f!",solution);
        }
        else{
            if (b==0){
            System.out.print("The Solution is all x!");
            } else {
                System.out.println("No Solution!");
            }
        }
    }
}
