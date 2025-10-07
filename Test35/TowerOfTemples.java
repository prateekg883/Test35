// Q11. Tower of Temples (Hanoi) - Move golden disks
public class TowerOfTemples {
    private static int moves = 0;
    
    public static int solve(int n) {
        moves = 0;
        hanoi(n, 'A', 'C', 'B');
        return moves;
    }

    private static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            moves++;
            return;
        }
        hanoi(n-1, from, aux, to);
        moves++;
        hanoi(n-1, aux, to, from);
    }

    public static void main(String[] args) {
        System.out.println("Output: " + solve(3));
    }
}