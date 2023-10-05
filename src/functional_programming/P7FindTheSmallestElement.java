package functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class P7FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] numberStrings = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String numStr : numberStrings) {
            numbers.add(Integer.parseInt(numStr));
        }

        // Define a Function to find the index of the rightmost smallest element
        Function<List<Integer>, Integer> findRightmostSmallestIndex = list -> {
            int smallest = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < list.size(); i++) {
                int num = list.get(i);
                if (num <= smallest) {
                    smallest = num;
                    index = i;
                }
            }

            return index;
        };

        int rightmostSmallestIndex = findRightmostSmallestIndex.apply(numbers);

            System.out.println(rightmostSmallestIndex);

    }
}
