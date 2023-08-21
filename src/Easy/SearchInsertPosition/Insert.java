package Easy.SearchInsertPosition;

public class Insert {
    public static int searchInsert(int[] nums, int target) {
        int position;
        for (position = 0; position < nums.length; position++)
            if (nums[position] == target || nums[position] > target)
                break;
        return position;
    }
}