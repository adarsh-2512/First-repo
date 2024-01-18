import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password you want to check: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("invalid Password");
        }

        sc.close();
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;

        for (char currentChar : password.toCharArray()) {
            if (Character.isLowerCase(currentChar)) {
                hasLower = true;
            } else if (Character.isUpperCase(currentChar)) {
                hasUpper = true;
            } else if (Character.isDigit(currentChar)) {
                hasDigit = true;
            } else if (!Character.isWhitespace(currentChar)) {
                hasSpecial = true;
            }
        }

        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
          }
