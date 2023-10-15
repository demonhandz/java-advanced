package defining_classes.p7_google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new LinkedHashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String command = tokens[1];

            if (!people.containsKey(name)) {
                people.put(name, new Person(name));
            }

            Person person = people.get(name);

            switch (command) {
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    person.setCompany(new Company(companyName, department, salary));
                    break;
                case "car":
                    String carModel = tokens[2];
                    int carSpeed = Integer.parseInt(tokens[3]);
                    person.setCar(new Car(carModel, carSpeed));
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    person.addPokemon(new Pokemon(pokemonName, pokemonType));
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];
                    person.addParent(new Parent(parentName, parentBirthday));
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthday = tokens[3];
                    person.addChild(new Child(childName, childBirthday));
                    break;
            }
        }

        String searchName = scanner.nextLine();
        if (people.containsKey(searchName)) {
            Person searchPerson = people.get(searchName);
            System.out.println(searchPerson.getName());
            System.out.println("Company:");
            if (searchPerson.getCompany() != null) {
                System.out.println(searchPerson.getCompany());
            }
            System.out.println("Car:");
            if (searchPerson.getCar() != null) {
                System.out.println(searchPerson.getCar());
            }
            System.out.println("Pokemon:");
            for (Pokemon pokemon : searchPerson.getPokemons()) {
                System.out.println(pokemon);
            }
            System.out.println("Parents:");
            for (Parent parent : searchPerson.getParents()) {
                System.out.println(parent);
            }
            System.out.println("Children:");
            for (Child child : searchPerson.getChildren()) {
                System.out.println(child);
            }
        } else {
            System.out.println("Person not found.");
        }
    }
}
