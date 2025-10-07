// Q2. The Lost Soldier - Find missing soldier number
// Q2. The Lost Soldier - Find missing soldier
public class LostSoldier {
    public static int findMissingSoldier(int n, int[] arr) {
        // Using XOR approach for O(n) solution
        int xor = 0;
        
        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }
        
        // XOR with all array elements
        for (int num : arr) {
            xor ^= num;
        }
        
        return xor;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0, 1, 2, 4, 5};
        
        int missing = findMissingSoldier(n, arr);
        System.out.println("Output: " + missing);
    }
}
