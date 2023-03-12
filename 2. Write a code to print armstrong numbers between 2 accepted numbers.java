import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = input.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = input.nextInt();
        input.close();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int i) {
        int sum = 0;
        int order = String.valueOf(i).length();
        int temp = i;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, order);
            temp /= 10;
        }
        return sum == i;
    }
}
