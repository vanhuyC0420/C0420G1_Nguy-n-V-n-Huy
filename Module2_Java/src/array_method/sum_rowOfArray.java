package array_method;

import java.util.Scanner;

public class sum_rowOfArray {
    public static void main(String[] args) {
//        int row = 2;
//        int col;
        Scanner scanner = new Scanner(System.in);
        // Cho người dùng nhập vào mảng!!!
//        do {
//            System.out.print("Nhập vào số cột:");
//            col = scanner.nextInt();
//            if (col>10)
//                System.out.println("Ít hơn 10 phần tử để nhập cho nhanh!!!");
//        }while (col > 10);
//        double arrNum[][]=new double[row][col];
//        for (int i = 0;i<row;i++){
//            for (int j = 0;j<col;j++){
//                System.out.printf("Cột thứ %d: \t",j);
//                System.out.printf("Hàng thứ %d: \n",i);
//                System.out.printf("Nhập giá trị arrNum[%d][%d] = ",i,j);
//                arrNum[i][j]=scanner.nextDouble();
//            }
//        }
//        for (int i = 0;i<row;i++){
//            for (int j = 0;j<col;j++){
//                System.out.print(arrNum[i][j]+"\t");
//            }
//            System.out.print("\n");
//        }

        // Khởi tạo nhanh 1 mảng!!!
        double arrNum[][]={{1.2, 2.2, 3.3},{4.4, 4.4, 4.4}};

        System.out.print("Nhập số cột muốn tính tổng: ");
        int cot = scanner.nextInt();
        double sum = 0;
        for (int i = 0;i<2;i++){
            for (int j = 0;j<3;j++){
                if (j==cot){
                    sum+=arrNum[i][j];
                }
            }
        }
        System.out.printf("Tổng các phần tử cột %d = %f",cot,sum);
    }
}
