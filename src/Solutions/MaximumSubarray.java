package Solutions;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.function.Predicate;

import org.junit.Test;

public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                if(max < sum)
                    max = sum;
            }
        }
        return max;
    }
	
	 public int maxSubArray_2(int[] nums) {
	        int maxSum = Integer.MIN_VALUE;
	        int nextSum = 0;
	        for(int i=0;i<nums.length;i++){
	            nextSum = nextSum + nums[i] < nums[i] ? nums[i] : nextSum + nums[i] ;
	            maxSum = nextSum > maxSum ? nextSum : maxSum;        
	        }
	        return maxSum;
	    }
}
