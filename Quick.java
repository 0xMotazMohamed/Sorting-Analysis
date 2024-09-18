public class Quick extends AbstractSort {
    @Override
    protected void sort(Comparable[] a) {
        Random.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            comparisons++;
            while (less(a[++i], a[lo])) if (i == hi) break;
            comparisons++;
            while (less(a[lo], a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
}
