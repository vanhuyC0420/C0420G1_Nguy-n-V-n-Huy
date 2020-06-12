package array_method.tim_gtln_of_mang;

import java.util.Scanner;

public class findMaxValueInArray {
    public static void main(String[] args) {
        int size;
        int arrayNumber[];
        Scanner scanner = new Scanner(System.in);
        // Kiểm tra mảng bao nhiêu phần tử
        do {
            System.out.println("Enter a size.");
            size = scanner.nextInt();
            if (size>10)
                System.out.println("size should not exceed 10.");
        }while (size > 10);
        //Duyệt mảng và nhập vào các phần tử của mảng.
        arrayNumber = new int[size];
        int i = 0;
        while (i<arrayNumber.length){
            System.out.print("Enter element: "+(i+1)+" : ");
            arrayNumber[i]=scanner.nextInt();
            i++;
        }
        //In ra các phần tử của mảng.
        System.out.println("Display list: ");
        for (int j =0;j<arrayNumber.length;j++){
            System.out.println(arrayNumber[j]+"\t");
        }
        // Duyệt các phần tử để tìm ra giá trị lớn nhất.
        int max = arrayNumber[0];
        int index = 0;
        for (int j = 0; j<arrayNumber.length;j++){
            if (arrayNumber[j]>max){
                max=arrayNumber[j];
                index = j+1;
            }
        }
        System.out.println("The largert value in the list is: "+max+",at position: "+index);
    }
}
