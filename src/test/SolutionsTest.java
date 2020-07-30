package test;

import org.junit.Test;
import static org.junit.Assert.*;
import Solutions.MaximumSubarray;

public class SolutionsTest {

	@Test
	public void maximumSubarrayTest() {
		MaximumSubarray obj = new MaximumSubarray();
		int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		assertTrue(obj.maxSubArray(nums) == 6);
	}

}
