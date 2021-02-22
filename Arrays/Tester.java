import java.util.Scanner;

/**
 * Tester
 */
public class Tester {

    static Scanner input = new Scanner(System.in);

    public static ArrayUtil arrayUtil = new ArrayUtil();
    public static ReverseArray reverseArray = new ReverseArray();
    public static MinMaxArray min_max_Array = new MinMaxArray();
    public static KthSmallest kthSmallest = new KthSmallest();
    public static KthLargest kthLargest = new KthLargest();
    public static Sort012 sort012 = new Sort012();
    public static MoveAllNegatives moveAllNegatives = new MoveAllNegatives();
    public static RotateArray rotateArray = new RotateArray();
    public static Kadanes kadanes = new Kadanes();
    public static MinimizeHeights minimizeHeights = new MinimizeHeights();
    public static MinimumJumps minimumJumps = new MinimumJumps();
    public static FindDuplicate findDuplicate = new FindDuplicate();
    public static MergeIntervals mergeIntervals = new MergeIntervals();
    public static NextPermutation nextPermutation = new NextPermutation();
    public static StockExchange stockExchange = new StockExchange();
    public static PairWithKSum pairWithKSum = new PairWithKSum();
    
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

        // Kadanes.printMaxSumSubarray(arr);

        // int minHeight = MinimizeHeights.minimizeHeights(arr, 10);
        // System.out.println(minHeight);

        // int minJumps = MinimumJumps.minJumpsV1(arr);
        // System.out.println(minJumps);

        // int duplicate = FindDuplicate.findDuplicate(arr);
        // System.out.println(duplicate);

        // int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 }};

        // int[][] mergedIntervals = MergeIntervals.mergeIntervalas(intervals);

        // for (int i = 0; i < mergedIntervals.length; ++i) {
        //     for (int j = 0; j < mergedIntervals[i].length; ++j) {
        //         System.out.print(mergedIntervals[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // NextPermutation.nextPermutation(arr);
        // ArrayUtil.print(arr);

        // System.out.println(StockExchange.bestTimeToSell(arr));

        int sum = input.nextInt();

        System.out.println(PairWithKSum.countPairWithKSum(arr, sum));

    }
}