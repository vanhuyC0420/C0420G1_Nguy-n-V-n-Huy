package introduction.thuchanh;

import java.util.Scanner;

public class XinChao {
    public static void main(String[] args) {
//        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s ",name+ "\n");
        System.out.print("Hello "+ name);
    }
}
