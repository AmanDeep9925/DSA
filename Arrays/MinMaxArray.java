/**
 * MinMaxArray
 */
public class MinMaxArray {

    public static Pair arrayMinMax(int arr[]) {
        
        Pair min_max = new Pair();

        int N = arr.length;

        if (N == 1) {
            min_max.min = arr[0];
            min_max.max = arr[0];
            return min_max;
        }

        // Initialize the min max 

        if (arr[0] < arr[1]) {
            min_max.min = arr[0];
            min_max.max = arr[1];
        }else{
            min_max.min = arr[1];
            min_max.max = arr[0];
        }

        for (int i = 2; i < N; ++i) {
            if (arr[i] > min_max.max) {
                min_max.max = arr[i];
            }else if(arr[i] < min_max.min){
                min_max.min = arr[i];
            }
        }
        return min_max;
    }
}