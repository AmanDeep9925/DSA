/**
 * MoveAllNegatives
 */
public class MoveAllNegatives {

    public static void moveAllNegatives(int arr[]) {
        
        int j = 0;
        
        for (int i = 0; i < arr.length; ++i) {
            if(arr[i] < 0){
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}