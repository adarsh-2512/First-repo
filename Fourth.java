import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int score;

        if (num1 == num2 && num2 == num3) {
            score = 20;
        } else if (num1 != num2 && num2 != num3 && num3 != num1) {
            score = 0;
        } else {
            score = 10;
        }

        System.out.println("Your Lottery Score is: " + score);
        sc.close();
    }
}
