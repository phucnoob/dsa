package sort.mergesort;

import java.util.Arrays;
import sort.elementary.Sort;

public class MergeSort extends Sort {

    protected static <T extends Comparable<T>> boolean isSorted(T[] a, int begin, int end) {
        for (int i = begin + 1; i <= end; i++) {
            if (less(a[i], a[i - 1])) return false;
        }

        return true;
    }

    private static <T extends Comparable<T>> void merge(T[] a, T[] aux, int lo, int mid, int hi) {
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid + 1, hi);

        if (hi - lo >= 0)   System.arraycopy(a, lo, aux, lo, hi - lo + 1);

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++){
            if (i > mid)                    a[k] = aux[j++];
            else if (j > hi)                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))  a[k] = aux[j++];
            else                            a[k] = aux[i++];
        }
        Arrays.stream(a).skip(lo).limit(hi - lo)
            .forEach((item) -> System.out.print(item + " "));
        System.out.println();
        assert isSorted(a, lo, hi);
    }

    private static <T extends Comparable<T>> void sort(T[] array, T[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(array, aux, lo, mid);
        sort(array, aux, mid + 1, hi);
        merge(array, aux, lo, mid, hi);
    }

    public static <T extends Comparable<T>> void sort(T[] a) {
        T[] aux = Arrays.copyOf(a, a.length);
        sort(a, aux,0, a.length - 1);
    }
}
