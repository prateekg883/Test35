// Q27. The Battle Formation (Binary Search - Flattened)
// Q27. The Battle Formation - Binary search in sorted grid
public class BattleFormation {
    public static boolean find(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = matrix[mid/n][mid%n];
            
            if (val == target) return true;
            if (val < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5}, {7,10,11}, {16,20,30}};
        System.out.println("Output: " + find(matrix, 10));
    }
}