public class Heap extends AbstractSort {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        // Build heap (rearrange array)
        for (int k = N / 2 - 1; k >= 0; k--) {
            sink(a, k, N);
        }
        // Extract elements from heap one by one
        for (int i = N - 1; i > 0; i--) {
            exch(a, 0, i);  // Move current root to end
            sink(a, 0, i);  // Call sink on the reduced heap
        }
    }

    private void sink(Comparable[] a, int k, int N) {
        // Sink item down the heap
        while (2 * k + 1 < N) {
            int j = 2 * k + 1;
            if (j + 1 < N) {
                comparisons++; // Count comparison
                if (less(a[j], a[j + 1])) j++;
            }
            comparisons++; // Count comparison
            if (!less(a[k], a[j])) break;
            exch(a, k, j);
            k = j;
        }
    }
}
