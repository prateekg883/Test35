// Q9. The Messenger's Path
// Q9. The Messenger's Path - Path finding in grid
// Q9. The Messenger's Path - Path finding in grid
public class MessengersPath {
    public static boolean canReachDestination(int[][] grid) {
        if (grid == null || grid.length == 0) return false;
        return findPath(grid, 0, 0, new boolean[grid.length][grid[0].length]);
    }
    
    private static boolean findPath(int[][] grid, int row, int col, boolean[][] visited) {
        // Check if we reached destination
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return grid[row][col] == 0;
        }
        
        // Check bounds and if cell is blocked or already visited
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || 
            grid[row][col] == 1 || visited[row][col]) {
            return false;
        }
        
        visited[row][col] = true;
        
        // Try all four directions
        boolean canReach = findPath(grid, row + 1, col, visited) || // down
                          findPath(grid, row, col + 1, visited) || // right
                          findPath(grid, row - 1, col, visited) || // up
                          findPath(grid, row, col - 1, visited);   // left
                          
        return canReach;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        System.out.println("Output: " + canReachDestination(grid));
    }
}