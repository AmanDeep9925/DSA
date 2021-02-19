/**
 * FindDuplicate
 */
public class FindDuplicate {

    public static int findDuplicate(int arr[]){
        int tortoise = arr[0];
        int hare = arr[0];

        do{
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
        } while (tortoise != hare);

        tortoise = arr[0];

        while (tortoise != hare) {
            tortoise = arr[tortoise];
            hare = arr[hare];
        }

        return hare;
    }
}