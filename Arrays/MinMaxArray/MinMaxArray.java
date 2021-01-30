package MinMaxArray;
/**
 * MinMaxArray
 */
class Pair {
    int min;
    int max;
}

public class MinMaxArray {

    public static Pair arrayMinMax(int arr[]) {

        Pair min_max = new Pair();

        int N = arr.length;

        if (N == 1) {
            min_max.min = arr[0];
            min_max.max = arr[0];
            
            return min_max;
        }

        // * initialize min and max;

        if (arr[0] > arr[1]) {
            min_max.min = arr[1];
            min_max.max = arr[0];
        } else {
            min_max.min = arr[0];
            min_max.max = arr[1];
        }

        for (int i = 2; i < N; ++i) {
            if(min_max.min > arr[i]){
                // * found new min update the min_max
                min_max.min = arr[i];
            } else if (min_max.max < arr[i]) {
                // * found new max update the min_max
                min_max.max = arr[i];
            }
        }

        return min_max;
    }
}