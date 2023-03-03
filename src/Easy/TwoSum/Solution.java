package Easy.TwoSum;

/*Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 26;

        System.out.println(Arrays.toString(Sum.twoSum(nums, target)));
        System.out.println(Arrays.toString(Sum.twoSumHash(nums, target)));
    }
}