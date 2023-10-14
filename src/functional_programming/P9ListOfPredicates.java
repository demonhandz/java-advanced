package functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class P9ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<Integer> divisors = new ArrayList<>();
        String[] divisorStrings = scanner.nextLine().split("\\s+");
        for (String divisorString : divisorStrings) {
            int divisor = Integer.parseInt(divisorString);
            divisors.add(divisor);
        }

        Predicate<Integer> isDivisibleByAll = num -> {
            for (int divisor : divisors) {
                if (num % divisor != 0) {
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <= n; i++) {
            if (isDivisibleByAll.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
