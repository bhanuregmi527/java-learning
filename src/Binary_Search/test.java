package Binary_Search;

public class test {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 23;
        System.out.println(searchInfinite(arr, target));
    }

    static int searchInfinite(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Find the range that contains the target element
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end * 2;
            start = newStart;
        }

        // Perform a binary search within the found range
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Element not found
    }
}
