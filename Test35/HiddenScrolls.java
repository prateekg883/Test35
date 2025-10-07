// Q29. The Hidden Scrolls (Staircase Search)
// Q29. The Hidden Scrolls - O(n+m) staircase search
public class HiddenScrolls {
    public static boolean find(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) return true;
            if (matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11}, {2,5,8,12}, {3,6,9,16}, {10,13,14,17}};
        System.out.println("Output: " + find(matrix, 6));
    }
}