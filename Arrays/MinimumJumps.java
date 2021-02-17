// * Given an array of integers
// * where each element represents the max number of steps that can be made forward from that element.
// * Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element).
// * If an element is 0, they cannot move through that element. If the end isn’t reachable, return -1.

/**
 * MinimumJumps
 */
public class MinimumJumps {

    private static int minJumpsHelper(int arr[], int low, int high) {

        if (low == high) {
            return 0;
        }

        if (arr[low] == 0) {
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;

        for (int i = low + 1; i <= high && i <= low + arr[low]; ++i) {
            int jumps = minJumpsHelper(arr, i, high);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min) {
                min = jumps + 1;
            }
        }

        return min;
    }

    public static int minJumps(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        return minJumpsHelper(arr, low, high);
    }
    
    public static int minJumpsV1(int arr[]) {
        if (arr.length <= 1) {
            return 0;
        }

        if (arr[0] == 0) {
            return -1;
        }

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;


        for (int i = 1; i < arr.length; ++i) {
            if (i == arr.length - 1) {
                return jump;
            }

            maxReach = Math.max(maxReach, i + arr[i]);
            step--;

            if (step == 0) {
                jump++;
            }

            if (i >= maxReach) {
                return -1;
            }

            step = maxReach - i;
        }
        
        return -1;
    }
}