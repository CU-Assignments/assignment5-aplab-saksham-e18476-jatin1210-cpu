package Package2;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.poll(); 
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,1,5,6,4};
        int k1 = 2;
        System.out.println("Kth Largest: " + findKthLargest(nums1, k1)); 

        int[] nums2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;
        System.out.println("Kth Largest: " + findKthLargest(nums2, k2)); 
    }
}
