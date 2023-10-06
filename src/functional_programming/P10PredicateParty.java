package functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>();

        // Read the initial list of guests
        String[] initialGuests = scanner.nextLine().split("\\s+");
        for (String guest : initialGuests) {
            guests.add(guest);
        }

        String command;
        while (!(command = scanner.nextLine()).equals("Party!")) {
            String[] commandParts = command.split("\\s+");
            if (commandParts.length < 3) {
                continue; // Skip invalid commands
            }
            String operation = commandParts[0];
            String criteriaType = commandParts[1];
            String criteria = commandParts[2];

            switch (operation) {
                case "Remove":
                    removeGuests(guests, criteriaType, criteria);
                    break;
                case "Double":
                    doubleGuests(guests, criteriaType, criteria);
                    break;
            }
        }

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            List<String> sortedGuests = guests.stream().sorted().collect(Collectors.toList());
            System.out.println(String.join(", ", sortedGuests) + " are going to the party!");
        }
    }

    private static void removeGuests(List<String> guests, String criteriaType, String criteria) {
        guests.removeIf(getPredicate(criteriaType, criteria));
    }

    private static void doubleGuests(List<String> guests, String criteriaType, String criteria) {
        List<String> doubles = new ArrayList<>();
        Predicate<String> predicate = getPredicate(criteriaType, criteria);

        for (String guest : guests) {
            if (predicate.test(guest)) {
                doubles.add(guest);
            }
            doubles.add(guest);
        }

        guests.clear();
        guests.addAll(doubles);
    }

    private static Predicate<String> getPredicate(String criteriaType, String criteria) {
        switch (criteriaType) {
            case "StartsWith":
                return guest -> guest.startsWith(criteria);
            case "EndsWith":
                return guest -> guest.endsWith(criteria);
            case "Length":
                int length = Integer.parseInt(criteria);
                return guest -> guest.length() == length;
            default:
                return guest -> false; // Default predicate (no matching)
        }
    }
}


