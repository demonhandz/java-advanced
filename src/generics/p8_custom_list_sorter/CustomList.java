package generics.p8_custom_list_sorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CustomList<T extends Comparable<T>> {
    private List<T> data;

    public CustomList() {
        this.data = new ArrayList<>();
    }

    public void add(T element) {
        data.add(element);
    }

    public T remove(int index) {
        if (index >= 0 && index < data.size()) {
            return data.remove(index);
        }
        return null; // or throw an exception
    }

    public boolean contains(T element) {
        return data.contains(element);
    }

    public void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < data.size() && index2 >= 0 && index2 < data.size()) {
            T temp = data.get(index1);
            data.set(index1, data.get(index2));
            data.set(index2, temp);
        }
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T item : data) {
            if (item.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        if (data.isEmpty()) {
            return null; // or throw an exception
        }
        T max = data.get(0);
        for (T item : data) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public T getMin() {
        if (data.isEmpty()) {
            return null; // or throw an exception
        }
        T min = data.get(0);
        for (T item : data) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    public void print() {
        for (T item : data) {
            System.out.println(item);
        }
    }

    public void sort() {
        Collections.sort(data);
    }
}
