import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        num1 = (num1 > 12 && num1 < 15) || (num1 > 16 && num1 < 20) ? 0 : num1;
        num2 = (num2 > 12 && num2 < 15) || (num2 > 16 && num2 < 20) ? 0 : num2;
        num3 = (num3 > 12 && num3 < 15) || (num3 > 16 && num3 < 20) ? 0 : num3;

        int result = num1 + num2 + num3;
        System.out.println("Sum after fixing teens: " + result);

        sc.close();
    }
}
