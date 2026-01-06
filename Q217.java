
import java.util.HashSet;
import java.util.Set;

public class Q217 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        Q217 res = new Q217();
        System.out.println(res.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            if (!s.add(i)) {
                return true;
            }
        }
        return false;
    }
}
