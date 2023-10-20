package generics.p5_generic_count_method_strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T element) {
        int count = 0;
        for (T item : list) {
            if (item.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elements.add(scanner.nextLine());
        }

        String compareElement = scanner.nextLine();

        int result = countGreaterThan(elements, compareElement);
        System.out.println(result);
    }
}
