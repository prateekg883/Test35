// Q21. The first index where the element is greater than or equal to the target
// Q21. Lower Bound - First greater than or equal to target
public class LowerBound {
    public static int find(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};
        System.out.println("Output: " + find(arr, 6));
        System.out.println("Output: " + find(arr, 5));
    }
}