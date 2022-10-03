package unionfind;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UF {
    private final int[] id;
    private final int[] sz;
    public UF(int n) {
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]]; // connect i to grand-parent
            i = id[i];
        }
        return i;
    }

    void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] < sz[j])  { id[i] = j; sz[j] += sz[i]; }
        else                { id[j] = i; sz[i] += sz[j]; }
    }

    boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    int find(int p) {
        return 0;
    }

    int count(int p) {
        return 0;
    }

    public static void main(String[] args) throws FileNotFoundException {

        if (args.length > 0) {
            System.setIn(new FileInputStream(args[0]));
        }

        int n = StdIn.readInt();
        UF unionFind = new UF(n);

        while(!StdIn.isEmpty()) {
            int p, q;
            p = StdIn.readInt();
            q = StdIn.readInt();

            if (!unionFind.connected(p, q)) {
                unionFind.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }
}
