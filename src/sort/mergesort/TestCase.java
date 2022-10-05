package sort.mergesort;

import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;

public class TestCase {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = StdRandom.uniformInt(3);
        }

        MergeSort.sort(array);

        Arrays.stream(array).forEach(System.out::println);
    }
}
