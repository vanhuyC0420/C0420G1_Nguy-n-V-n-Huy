package introduction.thuchanh;
import java.util.Scanner;
public class hinhChuNhat {
    public static void main(String[] args) {
        float height;
        float wight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Wight: ");
        wight = scanner.nextFloat();
        System.out.println("Enter Height: ");
        height = scanner.nextFloat();
        float area = height * wight;
        System.out.println("Arer Rectangle is: " + area);
    }
}
