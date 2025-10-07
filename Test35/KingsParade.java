
// Q5. The King's Parade - Check sorted heights
public class KingsParade {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {3, 2, 1};
        
        System.out.println("Array 1: " + isSorted(arr1)); // true
        System.out.println("Array 2: " + isSorted(arr2)); // false
    }
}