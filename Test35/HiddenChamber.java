
// Q15. The Hidden Chamber - Array sum using recursion
public class HiddenChamber {
    public static int arraySum(int[] arr, int index) {
        if (index >= arr.length) return 0;
        return arr[index] + arraySum(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Output: " + arraySum(arr, 0));
    }
}