
import java.util.Arrays;

public class Q283 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12, 0, 4 };
        Q283 res = new Q283();
        res.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        int temp = 0;
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[last];
                nums[last] = temp;
                last++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
