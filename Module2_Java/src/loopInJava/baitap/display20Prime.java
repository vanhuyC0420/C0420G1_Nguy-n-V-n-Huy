package loopInJava.baitap;

import java.util.Scanner;

public class display20Prime {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào số lượng số nguyên tố cần in ra: ");
//        int number = scanner.nextInt();
//        int count = 0;
//        int n = 3;
//        while (count < number){
//            for (int i = 2;i<n;i++){
//                if (n % i== 0){
////                    continue;
//                }else {
//                    System.out.println(n);
//                    count++;
//                }
//            }
//            n+=1;
//        }
        // code trên sai từa lưa:

        int count = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of prime numbers you want to display:");
        int numberDisplay = input.nextInt();
        String temp = " số nguyên tố đầu tiên là: 2, ";
        String result = "";
        int number = 2;
        boolean checkPrime = true;
        while (count < numberDisplay) {
            number++;
            for (int j = 2; j < number; j++) {
                checkPrime = true;
                if (number % j == 0) {
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime) {
                count++;
                temp += number +", ";
            }
        }
        result = numberDisplay + temp;
        System.out.println(result);
    }
}
