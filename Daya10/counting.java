public class counting {
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 3, 7, 7};
        countingSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void countingSort(int arr[]) {
        // Find largest element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int j = 0; // index for arr[]
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i; // place the number into arr
                j++;        // move to next index
                count[i]--; // decrease count
            }
        }
    }
}
