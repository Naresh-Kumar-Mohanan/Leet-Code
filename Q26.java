
import java.util.Arrays;

class Q26 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        Q26 res = new Q26();
        System.out.println(res.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}