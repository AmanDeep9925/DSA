import java.util.HashMap;

/**
 * PairWithKSum
 */
public class PairWithKSum {

    public static int countPairWithKSum(int arr[],int sum) {
        int N = arr.length;

        // * Intitalize a map to store the frequency of the array elements

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < N; ++i) {

            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 0);
            }
            map.put(arr[i], map.get(arr[i]) + 1);
        }
        
        int pairCount = 0;

        for (int i = 0; i < N; ++i) {
            if (map.get(sum - arr[i]) != null) {
                pairCount+=map.get(sum - arr[i]);
            }

            if (sum - arr[i] == arr[i]) {
                pairCount--;
            }
        }

        return pairCount / 2;
    }
}