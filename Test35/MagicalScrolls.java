// Q26. The Magical Scrolls (Linear Search Return Index)
// Q26. The Magical Scrolls - Find position in 2D cabinet
public class MagicalScrolls {
    public static String find(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) return "(" + i + "," + j + ")";
            }
        }
        return "(-1,-1)";
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30}, {40,50,60}, {70,80,90}};
        System.out.println("Output: " + find(matrix, 60));
    }
}