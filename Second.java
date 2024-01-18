import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int luckySum = calculateLuckySum(num1, num2, num3);
        System.out.println("Your lucky Sum is: " + luckySum);

        sc.close();
    }

    private static int calculateLuckySum(int num1, int num2, int num3) {
        if (num1 == 13) {
            return 0;
        } else if (num2 == 13) {
            return num1;
        } else if (num3 == 13) {
            return num1 + num2;
        } else {
            return num1 + num2 + num3;
        }
    }
}
