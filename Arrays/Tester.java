/**
 * Tester
 */
public class Tester {

    public static ArrayUtil arrayUtil = new ArrayUtil();
    public static ReverseArray reverseArray = new ReverseArray();
    public static MinMaxArray min_max_Array = new MinMaxArray();

    public static void main(String[] args) {
        
        // * take input from the user
        int arr[] = ArrayUtil.takeInput();
        
        // * call the reverse function of the ReverseArray class

        // ReverseArray.reverseArray(arr);

        // * Print the result

        // ArrayUtil.print(arr);

        Pair min_max = MinMaxArray.arrayMinMax(arr);

        System.out.println("Minimum in array : " + min_max.min);
        System.out.println("Maximum in array : " + min_max.max);
    }
}