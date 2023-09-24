package multidimentional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P4MaximalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int cols = input[1];

        int [][] matrix = new int[rows][cols];

        fillMatrix(scanner, matrix);
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {

                int sum = matrix[row][col] + matrix[row][col+1] + matrix[row][col + 2]+
                        matrix[row + 1][col] + matrix[row+1][col + 1] + matrix[row+1][col + 2]+
                        matrix[row+2][col] + matrix[row + 2][col+1]+matrix[row+2][col+2];


                if(sum > maxSum){
                    maxSum = sum;
                    rowIndex = row;
                    colIndex = col;
                }

            }

        }

        System.out.printf("Sum = %d%n", maxSum);

        printMatrixMaxSum(matrix, rowIndex, colIndex);



    }

    private static void printMatrixMaxSum(int[][] matrix, int rowIndex, int colIndex) {
        for (int row = rowIndex; row < rowIndex +3; row++) {
            for (int cols = colIndex; cols < colIndex +3 ; cols++) {
                System.out.print(matrix[row][cols] + " ");
            }
            System.out.println();
        }

    }

    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int [] token = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = token;
        }
    }
}
