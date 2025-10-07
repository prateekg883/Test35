
// Q16. The Ancient Scroll - Search for scroll ID
// Q16. The Ancient Scroll - Search for scroll ID
public class AncientScroll {
    public static int findScroll(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8};
        int key = 7;
        System.out.println("Output: " + findScroll(arr, key));
    }
}