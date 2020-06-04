package Introduction.ThucHanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter year: ");
        year = scanner.nextInt();
        // Dùng biến check true or false.
        boolean isLeapYear = false;
        if (year%4 == 0){
            if (year%100 == 0){
                if (year%400 == 0){
                    isLeapYear = true;
                }
            }else isLeapYear = true;
        }
        if (isLeapYear){
            System.out.printf("%d là năm nhuận!",year);
        }else System.out.printf("%d không phải là năm nhuận!",year);

        // dùng theo cách thông thường.
//        if (year%4 ==0 ){
//            if (year%100 == 0){
//                if (year%400 == 0){
//                    System.out.printf("%d là năm nhuận!",year);
//                }else {
//                    System.out.printf("%d không phải là năm nhuận!",year);
//                }
//            }else {
//                System.out.printf("%d là năm nhuận!",year);
//            }
//        }else System.out.printf("%d không phải là năm nhuận!",year);
    }
}
