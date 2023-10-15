package defining_classes.p6_pokemon_trainer;

import java.util.ArrayList;
import java.util.List;

class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void checkForElement(String element) {
        boolean hasElement = false;
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getElement().equals(element)) {
                hasElement = true;
                break;
            }
        }
        if (hasElement) {
            badges++;
        } else {
            pokemons.forEach(pokemon -> pokemon.takeDamage(10));
            pokemons.removeIf(pokemon -> !pokemon.isAlive());
        }
    }

    public int getNumberOfPokemon() {
        return pokemons.size();
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", name, badges, getNumberOfPokemon());
    }
}
