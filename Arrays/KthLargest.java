import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * KthLargest
 */
public class KthLargest {

    public static int findKthLargestMinHeap(int arr[], int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int i = 0; i < k; ++i) {
            maxHeap.add(arr[i]);
        }

        for (int i = k; i < arr.length; ++i) {
            if (arr[i] > maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }

        return maxHeap.peek();
    }

    public static int findKthLargestMaxHeap(int arr[], int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; ++i) {
            maxHeap.add(arr[i]);
        }

        while (--k > 0) {
            maxHeap.poll();
        }

        return maxHeap.peek();
    }
}