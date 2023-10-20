package generics.p3_generic_swap_method_strings;

import java.util.List;

public class GenericSwap<T> {
    public void swap(List<T> list, int index1, int index2) {
        if (index1 >= 0 && index1 < list.size() && index2 >= 0 && index2 < list.size()) {
            T temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
        }
    }
}
