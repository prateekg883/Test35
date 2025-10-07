// Q12. The Magical Staircase - Count ways to climb stairs
// Q12. The Magical Staircase - Count ways to climb
public class MagicalStaircase {
    public static int count(int n) {
        if (n <= 1) return 1;
        if (n == 2) return 2;
        return count(n - 1) + count(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Output: " + count(n));
    }
}