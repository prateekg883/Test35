// Q24. The largest element ≤ target
// Q24. Floor Element - Largest element ≤ target
public class FloorElement {
    public static int find(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return arr[mid];
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right >= 0 ? arr[right] : -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        System.out.println("Output: " + find(arr, 5));
        System.out.println("Output: " + find(arr, 0));
    }
}