// Q1. Two Sum - Find indices of two numbers that add up to target
// Q3. Potion Mixing (Two Sum) - Find two potions that sum to target
public class TwoSum_3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7};
        int target = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    // Print 1-based indices
                    System.out.println("Indices (" + (i + 1) + "," + (j + 1) + ")");
                    return;
                }
            }
        }
        System.out.println("No pair found");
    }
}
