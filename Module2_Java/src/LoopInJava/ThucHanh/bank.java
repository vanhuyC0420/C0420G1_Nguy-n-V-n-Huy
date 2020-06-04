package LoopInJava.ThucHanh;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        double money;
        int month;
        double interest_rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng gửi tiền: ");
        month = input.nextInt();
        System.out.println("Nhập vào số lãi suất 1 năm:");
        interest_rate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0;i<month;i++){
            totalInterest =totalInterest + money*(interest_rate/100)/12;
        }
        System.out.println("Số tiền lãi thu được = "+totalInterest);
    }
}
