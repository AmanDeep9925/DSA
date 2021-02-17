/**
 * Tester
 */
public class Tester {

    public static ArrayUtil arrayUtil = new ArrayUtil();
    public static ReverseArray reverseArray = new ReverseArray();
    public static MinMaxArray min_max_Array = new MinMaxArray();
    public static KthSmallest kthSmallest = new KthSmallest();
    public static KthLargest kthLargest = new KthLargest();
    public static Sort012 sort012 = new Sort012();
    public static MoveAllNegatives moveAllNegatives = new MoveAllNegatives();
    public static RotateArray rotateArray = new RotateArray();
    public static Kadanes kadanes = new Kadanes();

    public static void main(String[] args) {
        
        // * take input from the user
        int arr[] = ArrayUtil.takeInput();
        
        // * call the reverse function of the ReverseArray class

        // ReverseArray.reverseArray(arr);

        // * Print the result

        // ArrayUtil.print(arr);

        // Pair min_max = MinMaxArray.arrayMinMax(arr);

        // System.out.println("Minimum in array : " + min_max.min);
        // System.out.println("Maximum in array : " + min_max.max);

        // System.out.println(KthSmallest.findKthSmallestMinHeap(arr, 3));
        // System.out.println(KthSmallest.findKthSmallestMaxHeap(arr, 3));

        // System.out.println(KthLargest.findKthLargestMaxHeap(arr, 3));
        // System.out.println(KthLargest.findKthLargestMinHeap(arr, 3));

        // Sort012.sort012(arr);
        
        // MoveAllNegatives.moveAllNegatives(arr);
        
        // RotateArray.rotate(arr);
        // ArrayUtil.print(arr);
        
        // int maxSumOfContinousSubArray = Kadanes.maxSubArraySum(arr);

        // System.out.println(maxSumOfContinousSubArray);

        Kadanes.printMaxSumSubarray(arr);

    }
}