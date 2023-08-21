package Easy.RemoveElement;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] expectedNums = {0, 1, 3, 0, 4};
        int k = Remove.removeElement(nums, 2); // Calls your implementation
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}