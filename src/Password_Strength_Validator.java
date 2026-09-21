//Project: Password Strength Validator
//Check whether a password meets rules: minimum length,
//at least one digit, one uppercase letter, and
//one special character — and report exactly what's missing.

import java.util.Scanner;

public class Password_Strength_Validator {
    public static void main(String[] args) {
        System.out.print("Enter your password here: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean isDigit = password.chars().anyMatch(Character::isDigit);
        boolean isUpper = password.chars().anyMatch(Character::isUpperCase);
        boolean hasSpecial = password.matches(".*[!@#$%^&*].*");
        boolean isStrong =  password.length()>=8 && isDigit && isUpper && hasSpecial;
        System.out.println(isStrong ? "Strong Password" : "Weak Password");
    }
}
