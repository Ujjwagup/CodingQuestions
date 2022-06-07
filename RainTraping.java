package Arrays;

public class RainTraping {
    public int bruteForce(int [] nums){
        int n = nums.length;
        int result =0;
        for (int i = 0; i < n; i++) {
            int leftmax=0, rightmax=0;
            for (int j = i-1; j >=0 ; j--) {
                if (nums[j]>leftmax)
                    leftmax=nums[j];
            }
            for (int j = i+1; j < n; j++) {
                if (nums[j]>rightmax)
                    rightmax=nums[j];
            }
            int min = (leftmax > rightmax) ? rightmax : leftmax;
            if (min > nums[i]){
            result += min - nums[i];
            }
        }
        return result;
    }

    public int optimal(int [] height){
        int n = height.length;
        int l=0, r=n-1;
        int leftmax =0, rightmax=0;
        int result =0;
        while(l <= r){
            if (height[l] <= height[r]){
                if (height[l] >= leftmax)
                    leftmax = height[l];
                else
                    result += leftmax-height[l];
                l++;
            }
            else {
                if(height[r] >= rightmax)
                    rightmax = height[r];
                else
                    result += rightmax-height[r];
                r--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int water = new RainTraping().bruteForce(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(water);
    }
}
