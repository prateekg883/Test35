// Q17. The Farmer's Basket
// Q17. The Farmer's Basket - Find if number exists
// Q17. The Farmer's Basket - Find if number exists
public class FarmersBasket {
    public static int searchFruit(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int key = 25;
        System.out.println("Output: " + searchFruit(arr, key));
    }
}