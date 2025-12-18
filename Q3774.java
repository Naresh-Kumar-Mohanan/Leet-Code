
import java.util.Arrays;

public class Q3774 {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 2, 4 };
        int k = 2;
        Q3774 res = new Q3774();
        System.out.println(res.absDifference(nums, k));
    }

    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length - 1;
        int sNum = 0, lNum = 0;
        for (int i = 0; i < k; i++) {
            sNum = sNum + nums[i];
            lNum = lNum + nums[len - i];
        }
        return Math.abs(sNum - lNum);
    }
}
