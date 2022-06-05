package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) return;
        int rightMostPeak=-1;
        int index = -1;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i+1] > nums[i])
                rightMostPeak = i+1;
        }
        if (rightMostPeak == -1)
            Arrays.sort(nums);
        else {
            index = rightMostPeak;
            for (int i = rightMostPeak+1; i <nums.length ; i++) {
                if (nums[i] > nums[rightMostPeak-1] && nums[i]<nums[rightMostPeak])
                    index=i;
            }
            swap(nums, index,rightMostPeak-1);
            Arrays.sort(nums,rightMostPeak,nums.length);

        }


    }

    private void swap(int[] nums, int index, int i) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2};
        new NextPermutation().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
