package generics.p4_generic_swap_method_integers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            elements.add(Integer.parseInt(scanner.nextLine()));
        }

        String[] swapCommand = scanner.nextLine().split(" ");
        int index1 = Integer.parseInt(swapCommand[0]);
        int index2 = Integer.parseInt(swapCommand[1]);

        GenericSwap<Integer> swapUtil = new GenericSwap<>();
        swapUtil.swap(elements, index1, index2);

        for (Integer element : elements) {
            System.out.println("java.lang.Integer: " + element);
        }
    }
}
