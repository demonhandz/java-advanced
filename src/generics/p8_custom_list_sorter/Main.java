package generics.p8_custom_list_sorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        String command;
        while (!(command = scanner.next()).equals("END")) {
            switch (command) {
                case "Add":
                    customList.add(scanner.next());
                    break;
                case "Remove":
                    int index = Integer.parseInt(scanner.next());
                    customList.remove(index);
                    break;
                case "Contains":
                    System.out.println(customList.contains(scanner.next()));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(scanner.next());
                    int index2 = Integer.parseInt(scanner.next());
                    customList.swap(index1, index2);
                    break;
                case "Greater":
                    String element = scanner.next();
                    System.out.println(customList.countGreaterThan(element));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Sort":
                    customList.sort();
                    break;
                case "Print":
                    customList.print();
                    break;
            }
        }
    }
}
