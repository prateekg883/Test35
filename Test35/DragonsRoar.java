// Q14. The Dragon's Roar - Print numbers using recursion
// Q14. The Dragon's Roar - Print numbers recursively
public class DragonsRoar {
    public static void print(int n) {
        if (n < 1) return;
        print(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.print("Output: ");
        print(5);
        System.out.println();
    }
}