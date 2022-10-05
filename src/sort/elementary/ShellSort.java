package sort.elementary;

public class ShellSort extends Sort {
    static <T extends Comparable<T>> void sort(T[] a) {
        int h = 1;
        int n = a.length;
        while (h < n / 3) h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < n; i += h) {
                for (int j = i; j >= h; j -= h) {
                    if (less(a[j], a[j - h]))   exchange(a, j, j - h);
                    else                        break;
                }
            }

            h /= 3;
        }
    }
}
