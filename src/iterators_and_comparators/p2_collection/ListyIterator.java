package iterators_and_comparators.p2_collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

class ListyIterator<T> implements Iterable<T> {
    private T[] elements;
    private int currentIndex;

    public ListyIterator(T... elements) {
        this.elements = elements;
        this.currentIndex = 0;
    }

    public boolean Move() {
        if (HasNext()) {
            currentIndex++;
            return true;
        }
        return false;
    }

    public boolean HasNext() {
        return currentIndex < elements.length - 1;
    }

    public void Print() {
        if (elements.length > 0) {
            System.out.println(elements[currentIndex]);
        } else {
            System.out.println("Invalid Operation!");
        }
    }

    public void PrintAll() {
        for (T element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int iteratorIndex = 0;

            @Override
            public boolean hasNext() {
                return iteratorIndex < elements.length;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return elements[iteratorIndex++];
            }
        };
    }
}
