package generics.p6_generic_count_method_doubles;

class Box<T extends Comparable<T>> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isGreaterThan(T other) {
        return value.compareTo(other) > 0;
    }
}
