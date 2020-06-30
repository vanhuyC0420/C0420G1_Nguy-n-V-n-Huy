package regex_string.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static final String REGEX = "^[+][0-9]{2}[-][0][0-9]{9,10}$";
    public boolean validate(String NAME, String string){
        boolean result = Pattern.matches(NAME,string);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidatePhoneNumber phone = new ValidatePhoneNumber();
        boolean check = false;
        do {
            System.out.println("Nhập sđt vào bạn ei: ");
            String string = scanner.nextLine();
            if (phone.validate(REGEX,string)){
                check=true;
                System.out.println("Nhập đúng rồi bạn ei....!");
            }else System.out.println("Sai rồi, nhập lại dùm bạn ei...!");
        }while (!check);

    }
}
