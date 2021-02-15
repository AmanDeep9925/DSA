// * TO cyclicaly rotate the array by one

/**
 * RotateArray
 */
public class RotateArray {

    public static void rotate(int arr[]) {
        
        int N = arr.length;
        int temp = arr[N - 1];

        for (int i = N - 1; i > 0; --i) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }
}