package Package2;

import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) { 
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 1) { 
                mid++;
            } else { 
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        int[] nums2 = {2, 0, 1};

        sortColors(nums1);
        sortColors(nums2);

        System.out.println("Sorted nums1: " + Arrays.toString(nums1));
        System.out.println("Sorted nums2: " + Arrays.toString(nums2));
    }
}
