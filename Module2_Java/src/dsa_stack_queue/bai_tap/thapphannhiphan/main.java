package dsa_stack_queue.bai_tap.thapphannhiphan;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Converser stack = new Converser(10);
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển sang hệ nhị phân: ");
        num = scanner.nextInt();
        while (num!=0){
            int numd = num%2;
            stack.push(numd);
            num/=2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();

    }
}
