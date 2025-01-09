//package DSA;
//
//public class RotationCount {
//    public static void main(String[] args) {
//          int pivot = search()
//    }
//    public static int search(int[] nums, int target) {
//        int left = 0, right = nums.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            // Check if the mid element is the target
//            if (nums[mid] == target) {
//                return mid;
//            }
//
//            // Determine which half is sorted
//            if (nums[left] <= nums[mid]) { // Left half is sorted
//                if (nums[left] <= target) {
//                    right = mid - 1; // Target is in the left half
//                } else {
//                    left = mid + 1; // Target is in the right half
//                }
//            } else { // Right half is sorted
//                if (nums[mid] < target && target <= nums[right]) {
//                    left = mid + 1; // Target is in the right half
//                } else {
//                    right = mid - 1; // Target is in the left half
//                }
//            }
//        }
//
//        return -1; // Element not found
//    }
//
//}
