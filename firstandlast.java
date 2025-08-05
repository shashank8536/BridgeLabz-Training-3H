
// public class firstandlast {

//     public static int[] Fl(int[] arr, int target) {
//         int[] nums = new int[2];
//         nums[0] = nums[1] = -1;  

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 nums[0] = i;
//                 break;
//             }
//         }

//         if (nums[0] == -1) {
//             return nums;
//         }
//         for (int j = arr.length - 1; j >= nums[0]; j--) {
//             if (arr[j] == target) {
//                 nums[1] = j;
//                 break;
//             }
//         }

//         return nums;
//     }

//     public static void main(String[] args) {
//         int[] arr = {5, 7, 7, 8, 8,8, 10};
//         int target = 8;

//         int[] result = Fl(arr, target);
    
//     System.out.println("(" + result[0] + ", " + result[1] + ")");
// }

// }

public class firstandlast {

    
    public static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    
    public static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    // Main function to return both first and last index
    public static int[] Fl(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = findFirst(arr, target);
        result[1] = findLast(arr, target);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;

        int[] result = Fl(arr, target);
        System.out.println("(" + result[0] + ", " + result[1] + ")");
    }
}
