// Q10. The Rainwater Pond - Count water ponds
public class RainwaterPond {
    public static int count(int[][] grid) {
        int ponds = 0;
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !seen[i][j]) {
                    fill(grid, i, j, seen);
                    ponds++;
                }
            }
        }
        return ponds;
    }

    private static void fill(int[][] grid, int row, int col, boolean[][] seen) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || 
            seen[row][col] || grid[row][col] == 0) return;
        
        seen[row][col] = true;
        // Visit all 8 adjacent cells
        fill(grid, row-1, col, seen);   // up
        fill(grid, row+1, col, seen);   // down
        fill(grid, row, col-1, seen);   // left
        fill(grid, row, col+1, seen);   // right
        fill(grid, row-1, col-1, seen); // up-left
        fill(grid, row-1, col+1, seen); // up-right
        fill(grid, row+1, col-1, seen); // down-left
        fill(grid, row+1, col+1, seen); // down-right
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 0, 1}
        };
        System.out.println("Output: " + count(grid));
    }
}