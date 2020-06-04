package Introduction.ThucHanh;

import java.util.Scanner;

public class KhuMaLapinMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng cần kiểm tra vào!");
        int month = scanner.nextInt();
        String dayIsMonth;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayIsMonth = "31";
                break;
            case 2:
                dayIsMonth = "28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayIsMonth = "30";
                break;
            default:
                dayIsMonth = "";
                break;
        }
        if (dayIsMonth!="") System.out.printf("Tháng '%d' có %s ngày!",month,dayIsMonth);
        else System.out.println("Bạn nhập sai tháng rồi!");
    }
}
