/**
 * ReverseArray
 */
public class ReverseArray {

    /* 
        * To reverse the array
        * Traverse the array to half
        * and swap the ith element to the (N - i - 1)th element
    */

    public static void reverseArray(int arr[]) {
        int N = arr.length;

        for (int i = 0; i < N / 2; ++i) {
            int temp = arr[i];
            arr[i] = arr[N - i - 1];
            arr[N - i - 1] = temp;
        }
    }
}