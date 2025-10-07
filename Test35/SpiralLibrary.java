// Q7. The Spiral Library
// Q7. The Spiral Library - Print matrix in spiral order
// Q7. The Spiral Library - Print matrix in spiral order
public class SpiralLibrary {
    public static void printSpiral(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        
        System.out.print("Output: [");
        boolean first = true;
        
        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                if (!first) System.out.print(",");
                System.out.print(matrix[top][i]);
                first = false;
            }
            top++;
            
            // Print right column
            for (int i = top; i <= bottom; i++) {
                if (!first) System.out.print(",");
                System.out.print(matrix[i][right]);
                first = false;
            }
            right--;
            
            if (top <= bottom) {
                // Print bottom row
                for (int i = right; i >= left; i--) {
                    if (!first) System.out.print(",");
                    System.out.print(matrix[bottom][i]);
                    first = false;
                }
                bottom--;
            }
            
            if (left <= right) {
                // Print left column
                for (int i = bottom; i >= top; i--) {
                    if (!first) System.out.print(",");
                    System.out.print(matrix[i][left]);
                    first = false;
                }
                left++;
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printSpiral(matrix);
    }
}