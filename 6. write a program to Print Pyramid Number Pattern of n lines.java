import java.util.Scanner;

public class PyramidNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        
        // Outer loop to iterate over the rows
        for (int i = 1; i <= n; i++) {
            
            // Inner loop to print the numbers on each row
            for (int j = i; j <= 2*i-1; j++) {
                System.out.print(j + " ");
            }
            
            for (int j = 2*i-2; j >= i; j--) {
                System.out.print(j + " ");
            }
            
            // Move to the next row
            System.out.println();
        }
    }
}
