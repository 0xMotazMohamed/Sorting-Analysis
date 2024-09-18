public class SortingAnalysis {

    public static void main(String[] args) {
        // Generate and shuffle a sorted array
        Integer[] data = generateSortedArray(100);
        Random.shuffle(data); // Shuffle the array to ensure randomness

        // Array of sorting algorithms
        AbstractSort[] algorithms = {
                new Selection(),
                new Bubble(),
                new Insertion(),
                new Heap(),
                new Shell(),
                new Merge(),
                new Quick()
        };

        // Execute and analyze each sorting algorithm
        for (AbstractSort algo : algorithms) {
            // Clone the array before sorting
            Integer[] dataCopy = data.clone();

            // Perform sorting and print results
            algo.execute(dataCopy);
        }
    }

    // Utility function to generate a sorted array of integers
    private static Integer[] generateSortedArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i; // Fill the array with values from 0 to size-1
        }
        return array;
    }
}
