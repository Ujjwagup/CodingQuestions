package Arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
            int [] rightMultiplication = new int[nums.length];
        int [] result = new int[nums.length];
            int mul =1;
        for (int i = nums.length-1; i >=0 ; i--) {
            rightMultiplication [i] = nums[i]*mul;
            mul = mul * nums[i];
        }
        mul =1;
        for (int i = 0; i < nums.length; i++) {
           if (i != nums.length-1)
            result[i] = mul * rightMultiplication[i+1];
           else
               result[i] = mul;
           mul = mul * nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] res = new ProductArrayExceptSelf().productExceptSelf(new int[] {1,2,3,4});
        System.out.println(Arrays.toString(res));
    }
}
