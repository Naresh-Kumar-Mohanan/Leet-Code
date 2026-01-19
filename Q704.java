
import java.util.Scanner;

public class Q704 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = sc.nextInt();
        Q704 res = new Q704();
        System.out.println(res.search(nums, target));
    }

    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
