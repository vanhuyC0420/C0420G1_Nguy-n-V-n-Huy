package introduction.bai_tap;

import java.util.Scanner;
// Giả sử bạn đang tham gia viết chương trình cho máy đo chiều cao cân nặng,
// hãy viết một chương trình có khả năng đọc các số nguyên không âm có tối đa 3 chữ số.
//  Ví dụ, với số 261, chương trình in ra màn hình two hundred and sixty one.
public class numberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        short numdvi = scanner.nextShort();
//        if (num >=0 && num <= 10) {
            switch (numdvi) {
                case 0:
                    System.out.println("Zero!");
                    break;
                case 1:
                    System.out.println("One!");
                    break;
                case 2:
                    System.out.println("Two!");
                    break;
                case 3:
                    System.out.println("Three!");
                    break;
                case 4:
                    System.out.println("Four!");
                    break;
                case 5:
                    System.out.println("Five!");
                    break;
                case 6:
                    System.out.println("Six!");
                    break;
                case 7:
                    System.out.println("Seven!");
                    break;
                case 8:
                    System.out.println("Eight!");
                    break;
                case 9:
                    System.out.println("Nine!");
                    break;
                case 10:
                    System.out.println("Ten!");
                    break;
                case 11:
                    System.out.println("Eleven!");
                    break;
                case 12:
                    System.out.println("Twele!");
                    break;
//                default:
//                    System.out.println("out of ablity!");
//                    break;
            }
//        }
    }
}
