package iterators_and_comparators.p4_froggy;

import java.util.Iterator;

class Lake implements Iterable<Integer> {
    private int[] numbers;

    public Lake(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {
        private int index;
        private boolean isEven;

        public Frog() {
            index = 0;
            isEven = true;
        }

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            int number = numbers[index];
            index += 2;
            if (!hasNext() && isEven) {
                isEven = false;
                index = 1;
            }
            return number;
        }
    }
}
