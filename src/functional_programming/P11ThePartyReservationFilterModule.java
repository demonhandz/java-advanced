package functional_programming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


//THIS TASK ISN"T FINISHED
public class P11ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Predicate<String>> predicatesMap = new HashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("Print")) {
            String[] tokens = line.split(";");
            String command = tokens[0];
            String filterType = tokens[1];
            String filterParameter = tokens[2];

            if (command.equals("Add filter")) {
                Predicate<String> predicate = createPredicate(filterType, filterParameter);
                predicatesMap.put(filterType + filterParameter, predicate);
            } else if (command.equals("Remove filter")) {
                Predicate<String> predicateToRemove = predicatesMap.get(filterType + filterParameter);
                if (predicateToRemove != null) {
                    predicatesMap.remove(filterType + filterParameter);
                }
            }

            line = scanner.nextLine();
        }

        guests.stream()
                .filter(guest -> predicatesMap.values().stream().allMatch(predicate -> predicate.test(guest)))
                .forEach(guest -> System.out.print(guest + " "));
    }

    private static Predicate<String> createPredicate(String filterType, String filterParameter) {
        switch (filterType) {
            case "Starts with":
                return s -> s.startsWith(filterParameter);
            case "Ends with":
                return s -> s.endsWith(filterParameter);
            case "Length":
                return s -> s.length() == Integer.parseInt(filterParameter);
            case "Contains":
                return s -> s.contains(filterParameter);
            default:
                throw new IllegalArgumentException("Invalid filter type: " + filterType);
        }
    }
}
