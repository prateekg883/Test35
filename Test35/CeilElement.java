// Q23. The smallest element ≥ target
// Q23. Ceiling Element - Smallest element ≥ target
public class CeilElement {
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
        return left < arr.length ? arr[left] : -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        System.out.println("Output: " + find(arr, 5));
        System.out.println("Output: " + find(arr, 9));
    }
}