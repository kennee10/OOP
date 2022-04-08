import java.util.Arrays;

public class Search {
    // O(n)
    public static int linearSearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
 
    // O(lg n)
    public static int binarySearch(int arr[], int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (right + left)/2;

            if (x == arr[middle]) {
                return middle;
            } else if (x < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }
        return -1;
    }
    // Driver method to test above
    public static void main(String[] args)
    {
        // 8/2 = 4
        // l = 0 (4-0)/2 -> 2
        // r = 4
        int[] arr = {1,3,4,5,6,7,11,15};
        // System.out.println(Search.linearSearch(arr, 1));
        // System.out.println(Search.linearSearch(arr, 5));
        // System.out.println(Search.linearSearch(arr, 11));
        // System.out.println(Search.linearSearch(arr, 17));  
        System.out.println(Search.binarySearch(arr, 1));
        System.out.println(Search.binarySearch(arr, 5));
        System.out.println(Search.binarySearch(arr, 11));
        System.out.println(Search.binarySearch(arr, 17));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 11));
        System.out.println(Arrays.binarySearch(arr, 17));
        

    }
}