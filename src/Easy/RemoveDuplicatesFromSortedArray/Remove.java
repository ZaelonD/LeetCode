package Easy.RemoveDuplicatesFromSortedArray;

public class Remove {
    public static int removeDuplicates(int[] nums) {
        int uniqueElement = nums[0];
        int uniqueElementCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != uniqueElement) {
                nums[uniqueElementCount] = nums[i]; //sets new number to next index after unique element
                uniqueElement = nums[i]; // set unique element to new number
                uniqueElementCount++; // updates element count and also used for indexing
            }
        }
        return uniqueElementCount;
    }
}
