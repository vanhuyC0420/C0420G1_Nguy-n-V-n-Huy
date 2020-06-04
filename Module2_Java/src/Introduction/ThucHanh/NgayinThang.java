package Introduction.ThucHanh;

import java.util.Scanner;

public class NgayinThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that want to count days? ");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng '"+month+"' có 31 ngày! ");
                break;
            case 2:
                System.out.println("The month '"+month+"' has 28 or 29 days! ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng '"+month+"' có 30 ngày thôi!");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
