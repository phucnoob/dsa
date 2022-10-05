package sort.elementary;

import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;

public class Experiment {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Double[] a = new Double[n];

        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniformDouble();
        }

        ShellSort.sort(a);
//        Insertion.exchange(a, 1, 2);

        Arrays.stream(a).forEach(System.out::println);
        System.out.println(Insertion.isSorted(a) ? "OK" : "Not ok");
    }
}
