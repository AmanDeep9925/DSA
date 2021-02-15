import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * KthSmallest
 */
public class KthSmallest {

    public static int findKthSmallestMaxHeap(int[] arr, int k) {
        // Using max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < k; ++i) {
            maxHeap.add(arr[i]);
        }

        for (int i = k; i < arr.length; ++i) {
            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }

        return maxHeap.peek();
    }
    
    public static int findKthSmallestMinHeap(int arr[], int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; ++i) {
            minHeap.add(arr[i]);
        }
        
        while (--k > 0) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}