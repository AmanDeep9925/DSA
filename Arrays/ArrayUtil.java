import java.util.Scanner;

/**
 * Array
 */
public class ArrayUtil {

    static Scanner input = new Scanner(System.in);

    // * This function will take the size of the array
    // * and element of the array of size entered by user.

    public static int[] takeInput() {
        // * Enter the size of the array to be created.
        int N = input.nextInt();

        // * declare an empty array
        int arr[] = new int[N];

        for (int i = 0; i < N; ++i) {
            arr[i] = input.nextInt();
        }

        return arr;
    }

    // * To print the output of the array

    public static void print(int arr[]) {
        int N = arr.length;

        for (int i = 0; i < N; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}