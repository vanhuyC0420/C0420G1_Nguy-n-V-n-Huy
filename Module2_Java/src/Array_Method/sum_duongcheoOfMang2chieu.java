package Array_Method;

import java.util.Scanner;

public class sum_duongcheoOfMang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canhArr;
        do {
            System.out.print("Nhập vào chiều dài cạnh ma trận vuông: ");
            canhArr=scanner.nextInt();
            if (canhArr>5)
                System.out.println("Nhập nhỏ thôi, nhiều nhập mệt!!!");
        }while (canhArr>5);

        double arrVuong[][]=new double[canhArr][canhArr];
        for (int i = 0;i<canhArr;i++){
            for (int j = 0;j<canhArr;j++){
                System.out.printf("Nhập giá trị arrNum[%d][%d] = " ,i,j);
                arrVuong[i][j]=scanner.nextDouble();
            }
        }

        System.out.println("Ma trận vuông có giá trị sau: ");
        for (int i = 0;i<canhArr;i++){
            for (int j = 0;j<canhArr;j++){
                System.out.print(arrVuong[i][j]+"\t");
            }
            System.out.print("\n");
        }

        double sum = 0;
        for (int i = 0;i<canhArr;i++) {
            for (int j = 0; j < canhArr; j++) {
                if (i==j)
                    sum += arrVuong[i][j];
            }
        }
        System.out.println("Tổng các phần tử trên đường chéo chính = "+sum);
    }
}
