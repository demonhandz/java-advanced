package iterators_and_comparators.p2_collection;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListyIterator<String> listyIterator = null;

        String input;
        while (!(input = scanner.nextLine()).equals("END")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            try {
                switch (command) {
                    case "Create":
                        listyIterator = new ListyIterator<>(Arrays.copyOfRange(tokens, 1, tokens.length));
                        break;
                    case "Move":
                        System.out.println(listyIterator.Move());
                        break;
                    case "HasNext":
                        System.out.println(listyIterator.HasNext());
                        break;
                    case "Print":
                        listyIterator.Print();
                        break;
                    case "PrintAll":
                        listyIterator.PrintAll();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
