package iterators_and_comparators.p6_strategy_pattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<Person> nameSortedSet = new TreeSet<>(new NameComparator());
        TreeSet<Person> ageSortedSet = new TreeSet<>(new AgeComparator());

        for (int i = 0; i < n; i++) {
            String[] personInfo = scanner.nextLine().split(" ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);

            Person person = new Person(name, age);
            nameSortedSet.add(person);
            ageSortedSet.add(person);
        }

        nameSortedSet.forEach(System.out::println);
        ageSortedSet.forEach(System.out::println);
    }
}
