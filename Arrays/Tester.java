
/**
 * Main
 */
public class Tester {

    // public static ArrayUtil arrayUtil = new ArrayUtil();
    // public static ReverseArray reverseArray = new ReverseArray();

    public static void main(String[] args) {
        
        // * take input from the user
        int arr[] = ArrayUtil.takeInput();
        
        // * call the reverse function of the ReverseArray class

        ReverseArray.reverseArray(arr);

        // * Print the result

        ArrayUtil.print(arr);
    }
}