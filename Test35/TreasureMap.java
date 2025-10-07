// Q25. The Treasure Map (Linear Search)
// Q25. The Treasure Map - Linear search in 2D grid
public class TreasureMap {
    public static boolean find(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Output: " + (find(matrix, 5) ? "Yes" : "No"));
    }
}