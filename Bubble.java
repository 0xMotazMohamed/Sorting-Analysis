public class Bubble extends AbstractSort {
    @Override
    protected void sort(Comparable[] a) {
        int n = a.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++;
                if (less(a[j + 1], a[j])) {
                    exch(a, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
