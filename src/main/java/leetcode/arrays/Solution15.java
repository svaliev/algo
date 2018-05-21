package leetcode.arrays;

import java.util.*;

/**
 * Created by shamil.valiev on 4/6/2018.
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i=0; i < nums.length-2; i++) {
            if (i == 0 || (i != 0 && nums[i] != nums[i-1])) {
                int lo = i + 1;
                int hi = nums.length - 1;
                int sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                        while (lo < hi && nums[lo]==nums[lo-1] && nums[hi]==nums[hi+1]) {
                            lo++;
                            hi--;
                        }
                    } else if (nums[lo] + nums[hi] > sum) hi--;
                    else lo++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        int[] nums = new int[]{0,0,0};
        System.out.println(solution15.threeSum(nums));
    }
}
