// Q4. The Secret Message
// Q4. The Secret Message - Reverse the array
// Q4. The Secret Message - Reverse the array
public class SecretMessage {
    public static int[] decodeMessage(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = decodeMessage(arr);
        
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}