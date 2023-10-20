package iterators_and_comparators.p6_strategy_pattern;

import java.util.Comparator;

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(), person2.getAge());
    }
}
