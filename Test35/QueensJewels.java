// Q28. The Queen's Jewels (Binary Search First Occurrence)
// Q28. The Queen's Jewels - First occurrence in 2D grid
public class QueensJewels {
    public static String find(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int idx = binarySearch(matrix[i], target);
            if (idx != -1) return "(" + i + "," + idx + ")";
        }
        return "(-1,-1)";
    }
    
    private static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1,2,2}, {3,4,4}, {5,6,7}};
        System.out.println("Output: " + find(matrix, 4));
    }
}