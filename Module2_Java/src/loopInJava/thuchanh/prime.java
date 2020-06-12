package loopInJava.thuchanh;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number<2){
            System.out.printf("%d is not prime. ",number);
        }else {
            if (number == 2) {
                System.out.printf("%d is prime. ", number);
            } else {
                for (int i = 2;i < number;i++){
                    if (number%i==0){
                        System.out.printf("%d is not prime. ",number);
                        break;
                    }else {
                        System.out.printf("%d is prime. ",number);
                        break;
                    }
                }
//                System.out.println("Cần tính lại đã");
            }
        }
    }
}
