package regex_string.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExamle {
    private static final String ACCount_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExamle() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCount_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    private static AccountExamle accountExample;

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcd_huy" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        accountExample = new AccountExamle();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
