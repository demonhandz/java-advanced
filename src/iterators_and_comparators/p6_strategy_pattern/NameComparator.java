package iterators_and_comparators.p6_strategy_pattern;

import java.util.Comparator;

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int nameLengthComparison = Integer.compare(person1.getName().length(), person2.getName().length());
        if (nameLengthComparison != 0) {
            return nameLengthComparison;
        }
        return person1.getName().compareToIgnoreCase(person2.getName());
    }
}
