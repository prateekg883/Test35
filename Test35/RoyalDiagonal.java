// Q8. The Royal Diagonal - Find sum of both diagonals
// Q8. The Royal Diagonal - Find sum of diagonals
public class RoyalDiagonal {
    public static void findDiagonalSums(int[][] m) {
        int d1 = 0, d2 = 0;
        int n = m.length;
        
        for (int i = 0; i < n; i++) {
            d1 += m[i][i];
            d2 += m[i][n-1-i];
        }
        
        System.out.println("Output: " + 
            m[0][0] + "+" + m[1][1] + "+" + m[2][2] + " =" + d1 + ", " +
            m[0][2] + "+" + m[1][1] + "+" + m[2][0] + " = " + d2);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        findDiagonalSums(matrix);
    }
}