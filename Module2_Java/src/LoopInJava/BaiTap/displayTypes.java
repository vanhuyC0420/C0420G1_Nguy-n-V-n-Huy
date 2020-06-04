package LoopInJava.BaiTap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class displayTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1.Print the rectangle(hình chữ nhật).");
            System.out.println("2.Print the square triangle(tam giác vuông) (The corner is square at 4 different angles: " +
                    "top-left, top-right, botton-left, botton-right).");
            System.out.println("3.Print isosceles triangle(tam giác cân).");
            System.out.println("5.Print the square triangle in botton - left.");
            System.out.println("4.Exit.");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    int length, width;
                    System.out.println("Enter length: ");
                    length = input.nextInt();
                    System.out.println("Enter width: ");
                    width = input.nextInt();
                    for (int i = 0; i < length; i++) {
                        System.out.print("\n");
                        for (int j = 0; j < width; j++) {
                            System.out.print("+");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập chiều dài cạnh hình vuông: ");
                    int canh = input.nextInt();
                    System.out.println("Print the square triangle in top - left.");
                    for (int i = 0; i <= canh; i++) {
                        System.out.print("\n");
                        for (int j = i; j < canh; j++) {
                            System.out.print("+");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap canh tam giac tam giác cân:");
                    int canh2 = input.nextInt();
                    System.out.println("Print isosceles triangle");
                    for (int i=0;i<canh2;i++) {
                        for (int j=0;j<canh2-i;j++) {
                            System.out.print(" ");
                        }
                        for (int j=canh2-i;j<canh2;j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.println("Nhập chiều dài cạnh hình vuông: ");
                    int canh3 = input.nextInt();
                    System.out.println("Print the square triangle in botton - left.");
                    for (int i = 0; i <= canh3; i++) {
                        System.out.print("\n");
                        for (int j = 0; j < i; j++) {
                            System.out.print("+");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.print("Nhập sai rồi bạn ơi: ");

            }
        }
    }
}
