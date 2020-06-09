package Array_Method.XoaPhanTuMang;

import java.util.Scanner;

public class DemKITUOFchuoi {
    public static void main(String[] args) {
        String chuoi[] = {"Nguyen van Huy"};
        char kitu;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào kí tự cần kiểm tra: ");
        kitu = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0;i<chuoi.length;i++){
//            if (Character.toString(chuoi).equals()) {
//                count++;
//            }
        }
        System.out.printf("Kí tự %c xuất hiện trong chuỗi %d lần",kitu,count);
    }
}
