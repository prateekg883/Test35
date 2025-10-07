// Q30. The Magic Portal (Binary Search 2D)
// Q30. The Magic Portal - Binary search in sorted matrix
public class MagicPortal {
    public static String find(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = matrix[mid/n][mid%n];
            
            if (val == target) return "Activated";
            if (val < target) left = mid + 1;
            else right = mid - 1;
        }
        return "Failed";
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1,2,8}, {3,6,10}, {7,9,12}};
        System.out.println("Output: " + find(matrix, 9));
    }
}