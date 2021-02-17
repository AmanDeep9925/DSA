import java.util.Arrays;

/**
 * MinimizeHeights
 */
public class MinimizeHeights {

    public static int minimizeHeights(int arr[], int k) {

        int N = arr.length;
        
        if (N == 1) {
            return 0;
        }

        Arrays.sort(arr);
        
        int res = arr[N - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[N - 1] - k;

        if (smallest > largest) {
            int temp = smallest;
            smallest = largest;
            largest = temp;
        }

        for (int i = 1; i < N - 1; ++i) {
            int sub = arr[i] - k;
            int add = arr[i] + k;

            if (sub >= smallest || add <= largest) {
                continue;
            }

            if (largest - sub < add - smallest) {
                smallest = sub;
            } else {
                largest = add;
            }
        }

        return Math.min(res, largest - smallest);
    }
}