// Q19. The Archer's Range
// Q19. The Archer's Range - Find first occurrence
// Q19. The Archer's Range - Find first occurrence
public class ArchersRange {
    public static int findFirstOccurrence(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key) {
                result = mid;
                right = mid - 1; // Continue searching in left half
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int key = 2;
        System.out.println("Output: " + findFirstOccurrence(arr, key));
    }
}