import edu.princeton.cs.algs4.StdRandom;

public class Random {
    public static void shuffle(Object[] a) {
        int n = a.length;
        for (int i = 0; i  n; i++) {
            int r = StdRandom.uniform(i + 1);
            exch(a, i, r);
        }
    }
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
