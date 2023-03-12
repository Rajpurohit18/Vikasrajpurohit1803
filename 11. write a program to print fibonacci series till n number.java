import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        

        int a = 0, b = 1;
        
        System.out.print(a+" "+b+" ");
       for (int i = 1; i <= n; i++) {
    	   int c= a+b;
    	   System.out.print(c+" ");
    	   
    	   a=b;
    	   b=c;
		
	}
        
    }
}
