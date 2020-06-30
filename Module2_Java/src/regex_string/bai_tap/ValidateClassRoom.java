package regex_string.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassRoom {
    public static final String REGEX = "^[ACP][0-9]{4,4}[GHIKLM]";
    public boolean validate(String NAMECLASS, String string){
        boolean result = Pattern.matches(NAMECLASS,string);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateClassRoom room = new ValidateClassRoom();
        boolean check = false;
        do {
            System.out.println("Nhập tên lớp: ");
            String string = scanner.nextLine();
            if (room.validate(REGEX,string)) {
                check = true;
                System.out.println("Đúng định dạng rồi ei...");
            }else System.out.println("Nhập sai rồi bạn ei!!");
        }while (!check);

    }
}
