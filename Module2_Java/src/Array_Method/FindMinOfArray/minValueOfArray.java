package Array_Method.FindMinOfArray;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Arrays;
import java.util.Scanner;

public class minValueOfArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Nhấp số lượng phần tử mảng: ");
            size=scanner.nextInt();
            if (size>10){
                System.out.println("Nhập số nhỏ thôi!!!");
            }
        }while (size>10);
        double arr[]=new double[size];
        for (int i = 0;i<size;i++){
            System.out.print("Phần tử thứ "+(i+1)+" = ");
            arr[i]=scanner.nextDouble();
        }
        double min = arr[0];
        for (int i = 0;i<size;i++){
            if (min>arr[i])
                min = arr[i];
        }
        System.out.println("Phần tử min của mảng = "+min);
        // 2 cậu lệnh in giá trị mảng như bên dưới là sai.
        // System.out.println("Mảng arr = "+arr[size]);
       // System.out.printf("Mảng arr = %f", Arrays.toString(arr));
    }

}
