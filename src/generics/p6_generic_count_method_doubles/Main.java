package generics.p6_generic_count_method_doubles;

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

        List<Double> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elements.add(Double.parseDouble(scanner.nextLine()));
        }

        Double compareElement = Double.parseDouble(scanner.nextLine());

        int result = countGreaterThan(elements, compareElement);
        System.out.println(result);
    }
}
