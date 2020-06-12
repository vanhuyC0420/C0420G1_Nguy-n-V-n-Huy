package introduction.bai_tap;

import java.util.Scanner;

public class conveserCurrency {
    public static void main(String[] args) {
        int race = 23000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number USD: ");
        int usd = scanner.nextInt();
        int vnd = race*usd;
        System.out.printf("Converse to VND = %dđ",vnd);
    }
}
