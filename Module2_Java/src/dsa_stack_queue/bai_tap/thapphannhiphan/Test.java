package dsa_stack_queue.bai_tap.thapphannhiphan;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dãy số nhị phân cần chuyển sang thập phân:");
        String num1 = scanner.nextLine();
        System.out.println(Integer.parseInt(num1,2));
        Converser converser = new Converser(10);
        for (int i = 0; i < num1.length(); i++) {
            converser.push(Integer.valueOf(num1.charAt(i)));
        }
        int sum = 0;
        while (!converser.isEmpty()){
            for (double i = 0; i < converser.isLength(); i++) {
                converser.pop();
                if (converser.pop()==1){
                    sum+=Math.pow(2,i);
                }
            }
        }
        System.out.println(sum);
    }
}
