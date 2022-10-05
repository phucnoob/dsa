package sort.elementary;

public class Sort {

    static <T extends Comparable<T>> void exchange(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    static <T extends Comparable<T>> boolean isSorted(T[] a) {
        for (int i = 1; i < a.length; i++) {
            if (Sort.less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }

    static <T extends Comparable<T>> boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }
}
