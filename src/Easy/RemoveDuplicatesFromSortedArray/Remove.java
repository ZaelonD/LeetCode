package Easy.RemoveDuplicatesFromSortedArray;

import java.util.HashSet;

public class Remove {
    public static int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }
        temp[j] = nums[nums.length - 1];
        System.arraycopy(temp, 0, nums, 0, nums.length);
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i <= j; i++) {
            hashSet.add(nums[i]);
        }
        return hashSet.size();
    }
}
