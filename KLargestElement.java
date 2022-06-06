package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElement {
    public int findKthLargestUsingPriorityQueue(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i: nums
             ) {
            priorityQueue.add(i);
        }
        for (int i = 0; i < k; i++) {
            priorityQueue.poll();
        }
       return priorityQueue.peek();
    }
    public int findKthLargestUsingBubbleSort(int[] nums, int k){

        for (int i = 0; i < k; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        return nums[k-1];

    }

    public static void main(String[] args) {
        int [] nums ={3,2,3,1,2,4,5,5,6};
       // System.out.println(new KLargestElement().findKthLargestUsingPriorityQueue(nums,2));
        System.out.println(new KLargestElement().findKthLargestUsingBubbleSort(nums,4));
    }
}
