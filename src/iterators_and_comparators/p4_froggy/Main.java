package iterators_and_comparators.p4_froggy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNumbers = scanner.nextLine().split(", ");
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        Lake lake = new Lake(numbers);

        String command = scanner.nextLine();
        if (command.equals("END")) {
            StringBuilder output = new StringBuilder();
            for (int number : lake) {
                output.append(number).append(", ");
            }

            // Remove the trailing ", " from the output
            if (output.length() > 0) {
                output.setLength(output.length() - 2);
            }

            System.out.println(output.toString());
        }

        scanner.close();
    }
}
