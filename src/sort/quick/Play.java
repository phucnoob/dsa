package sort.quick;

import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Play {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = StdRandom.uniformInt(array.length);
        }

        String result = Arrays.stream(array)
            .map(Object::toString)
            .collect(Collectors.joining(" "));

        System.out.println(result);

        Quick.sort(array);

        result = Arrays.stream(array)
            .map(Object::toString)
            .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
