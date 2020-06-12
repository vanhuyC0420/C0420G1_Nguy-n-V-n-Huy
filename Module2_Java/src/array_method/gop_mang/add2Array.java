package array_method.gop_mang;

import java.util.Arrays;
import java.util.Scanner;

public class add2Array {
    public static void main(String[] args) {
        int size1, size2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng thứ nhất: ");
        size1 = scanner.nextInt();
        int mangnumber1[] = new int[size1];
        int i = 0;
        while (i < mangnumber1.length) {
            System.out.printf("Nhập các giá trị  thứ %d cho mảng 1: ", (i + 1));
            mangnumber1[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(mangnumber1));
        System.out.print("Nhập số lượng phần tử của mảng thứ 2:");
        size2 = scanner.nextInt();
        int mangnumber2[] = new int[size2];
        int j = 0;
        while (j < mangnumber2.length) {
            System.out.printf("Nhập phần tử thứ %d cho mảng 2: ", (j + 1));
            mangnumber2[j] = scanner.nextInt();
            j++;
        }
        System.out.println(Arrays.toString(mangnumber2));
        int size3 = size1+size2;
        int mangnumber3[] = new int[size3];
        for (int a =0;a<size1;a++){
            mangnumber3[a]=mangnumber1[a];
        }
        for (int a = size1;a<size3;a++){
            mangnumber3[a]=mangnumber2[a-size1];
        }
        // Cách khác nhưng rườm rà hơn.
//        for (int a = 0; a < mangnumber3.length; a++) {
//            if (a < mangnumber1.length)
//                mangnumber3[a] = mangnumber1[a];
//        }
//        for (int b = mangnumber1.length,b1 = 0; b < mangnumber3.length; b++,b1++){
//            mangnumber3[b]=mangnumber2[b1];
//        }
        System.out.println("Các phần tử của mảng 3 = "+ Arrays.toString(mangnumber3));
    }
}
