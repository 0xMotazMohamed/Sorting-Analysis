public abstract class AbstractSort {
    protected int comparisons = 0;
    protected int swaps = 0;

    // Method to be implemented by each sorting algorithm
    protected abstract void sort(Comparable[] a);

    // Common sort method that each algorithm will use
    public void execute(Comparable[] a) {
        comparisons = 0;
        swaps = 0;

        long startTime = System.nanoTime();  // Start time
        sort(a);
        long endTime = System.nanoTime();    // End time

        long elapsedTime = endTime - startTime;

        // Print the desired format
        System.out.println("Algorithm: " + this.getClass().getSimpleName());
        System.out.println("Execution Time: " + elapsedTime + " ns");
        System.out.println("Array Sorted: " + isSorted(a));
        printAnalytics();
        System.out.println();  // Newline for readability between algorithms
    }

    protected boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected void exch(Comparable[] a, int i, int j) {
        swaps++;
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    protected boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public void printAnalytics() {
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
    }
}
