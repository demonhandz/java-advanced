package generics.p3_generic_swap_method_strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elements.add(scanner.nextLine());
        }

        String[] swapCommand = scanner.nextLine().split(" ");
        int index1 = Integer.parseInt(swapCommand[0]);
        int index2 = Integer.parseInt(swapCommand[1]);

        GenericSwap<String> swapUtil = new GenericSwap<>();
        swapUtil.swap(elements, index1, index2);

        for (String element : elements) {
            System.out.println("java.lang.String: " + element);
        }
    }
}
