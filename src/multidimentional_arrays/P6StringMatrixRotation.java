package multidimentional_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P6StringMatrixRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rotation = Integer.parseInt(scanner.nextLine().split("\\(")[1].replaceAll("\\)", ""));
        int rotationAngle = rotation % 360;

        String input = scanner.nextLine();
        List<String> words = new ArrayList<>();
        int maxLength = input.length(); // Initialize maxLength with the length of the first line

        while (!"END".equals(input)) {
            words.add(input);
            if (input.length() > maxLength) {
                maxLength = input.length();
            }
            input = scanner.nextLine();
        }

        int rows = words.size();
        int cols = maxLength;
        char[][] matrix = new char[rows][cols];

        fillMatrix(matrix, words);

        // Handle arbitrary rotation angles
        int rotations = (rotationAngle / 90) % 4;
        for (int i = 0; i < rotations; i++) {
            matrix = rotate90(matrix, rows, cols);
            int temp = rows;
            rows = cols;
            cols = temp;
        }

        printMatrix(matrix);
    }

    private static char[][] rotate90(char[][] matrix, int rows, int cols) {
        char[][] rotatedMatrix = new char[cols][rows];
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                rotatedMatrix[col][row] = matrix[rows - 1 - row][col];
            }
        }
        return rotatedMatrix;
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(char[][] matrix, List<String> words) {
        for (int row = 0; row < matrix.length; row++) {
            String currentWord = words.get(row);
            for (int col = 0; col < matrix[row].length; col++) {
                if (col < currentWord.length()) {
                    matrix[row][col] = currentWord.charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
    }
}
