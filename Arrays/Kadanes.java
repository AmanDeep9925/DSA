/**
 * Kadanes
 */
public class Kadanes {

    public static int maxSubArraySum(int arr[]) {
        // * Store the size of the array;
        int N = arr.length;

        // * Initialize these variables
        // * 1 maxSoFar = Integer.MIN_VALUE
        // * 2 currentMax = 0;

        int maxSumSoFar = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < N; ++i) {
            // * add the current element to currentMax
            currentSum += arr[i];

            if (maxSumSoFar < currentSum) {
                // * time to update he maxSumSoFar
                maxSumSoFar = currentSum;
            }

            // * if current max is negative set it to zero;
            if (currentSum < 0) {
                // * set currentSum to 0;
                currentSum = 0;
            }
        }

        return maxSumSoFar;
    }

    // * To print the sub array having maximum sum;

    public static void printMaxSumSubarray(int arr[]) {
        // * store the size of the array
        int N = arr.length;

        int maxSumSoFar = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0;
        int end = 0;
        int iterator = 0;

        for (int i = 0; i < N; ++i) {
            currSum += arr[i];

            if (maxSumSoFar < currSum) {
                maxSumSoFar = currSum;
                start = iterator;
                end = i;
            }

            if (currSum < 0) {
                currSum = 0;
                iterator = i + 1;
            }
        }

        // * Now print the subarray with maximum sum

        for (int i = start; i <= end; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}