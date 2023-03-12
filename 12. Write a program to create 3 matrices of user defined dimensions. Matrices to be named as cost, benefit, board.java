public class MatrixProgram {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // get user input for matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        // create cost and benefit matrices with random values
        int[][] cost = createMatrix(rows, cols);
        int[][] benefit = createMatrix(rows, cols);
    }
}
