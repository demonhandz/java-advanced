package defining_classes.p6_pokemon_trainer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Tournament")) {
            String[] tokens = input.split(" ");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainers.computeIfAbsent(trainerName, Trainer::new).addPokemon(pokemon);
        }

        while (!(input = scanner.nextLine()).equals("End")) {
            for (Trainer trainer : trainers.values()) {
                trainer.checkForElement(input);
            }
        }

        List<Trainer> sortedTrainers = trainers.values().stream()
                .sorted((t1, t2) -> Integer.compare(t2.getBadges(), t1.getBadges()))
                .collect(Collectors.toList());

        for (Trainer trainer : sortedTrainers) {
            System.out.println(trainer);
        }
    }
}
