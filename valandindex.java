import java.util.*;

public class valandindex {

    
    public static int valueAndIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                if (mid == target) {
                    return target; 
                } else {
                    return -2; 
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        int result = valueAndIndex(arr, target);

        if (result == target) {
            System.out.println("Value found at same index: " + result);
        } else if (result == -2) {
            System.out.println("Value found, but not at matching index.");
        } else {
            System.out.println("Value not found.");
        }

        sc.close();
    }
}
