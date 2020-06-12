package array_method;

import java.util.Scanner;

public class demSVthido {
    static int size;
    static int arrStudent[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng sinh viên: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Ít thôi kẻo nhập mệt nha: ");

        }while (size>10);
        arrStudent = new int[size];
        for (int i = 0; i< size;i++){ // có thể dùng while để duyệt vòng lặp rồi nhập dữ liệu.
            System.out.print("Nhập điểm sinh viên thứ "+(i+1)+":");
            arrStudent[i]=scanner.nextInt();
        }
        int i = 0;
        int count = 0;
        System.out.println("List of mark:");
        while (i<size){
            System.out.println(arrStudent[i] + "\t");
            if (arrStudent[i] >= 5 && arrStudent[i] <=10)
                count++;
            i++;
        }
        System.out.printf("Số học sinh thi đổ = %d đứa!! ",count);
    }
}
