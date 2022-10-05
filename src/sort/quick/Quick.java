package sort.quick;

import edu.princeton.cs.algs4.StdRandom;
import sort.elementary.Sort;

public class Quick extends Sort {
    public static <T extends Comparable<T>> void sort(T[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    static <T extends Comparable<T>> void sort(T[] a, int lo, int hi) {
        if (lo >= hi) return;

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static <T extends Comparable<T>> int partition(T[] a, int lo, int hi) {

        int i = lo, j = hi + 1;
        while (true){
            while(less(a[++i], a[lo]))
                if (i == hi) break;
            while(less(a[lo], a[--j]))
                if (j == lo) break;

            if (i >= j)  break;

            exchange(a, i, j);
        }

        exchange(a, lo, j);

        return j;
    }
}
