// Q6. The Treasure Island
// Q6. The Treasure Island - Find row with maximum gold
// Q6. The Treasure Island - Find row with maximum gold
public class TreasureIsland {
    public static int findMaxGoldRow(int[][] grid) {
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;
        
        for (int i = 0; i < grid.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < grid[i].length; j++) {
                rowSum += grid[i][j];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRow = i;
            }
        }
        return maxRow;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int maxGoldRow = findMaxGoldRow(grid);
        System.out.println("Output: Row " + maxGoldRow + " (sum=" + (7+8+9) + ")");
    }
}