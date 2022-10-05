package sort.elementary;

public class Insertion extends Sort {

    static <T extends Comparable<T>> void sort(T[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j-1])) exchange(a, j, j - 1);
                else                    break;
            }
        }
    }
}
