package array_method.add_value_in_array;

import java.util.Arrays;
import java.util.Scanner;

public class addValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrnumber = new int[10];
        int i = 0;
        while (i<5){
            System.out.println("Enter element: "+(i+1));
            arrnumber[i]=scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(arrnumber));
        System.out.println("Nhập số cần thêm vào mảng:");
        int number = scanner.nextInt();
//        int index;
        System.out.println("Nhập vị trí cần xoá: ");
        int index = scanner.nextInt();
        if (index <=1 && index >= arrnumber.length){
            System.out.println("Không thể chèn phần tử vào mảng.");
        }else {
            for (int j = 0;j < arrnumber.length;j++){
                if (j==index){
                    arrnumber[j+1]=arrnumber[j];
                    arrnumber[j]=number;
                }
            }
        }
        System.out.println(Arrays.toString(arrnumber));
//        for (int j = 0;j<arrnumber.length;j++){
//            System.out.print(arrnumber[j]+", ");
//        }
//
    }
}
