
class Q136 {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        Q136 q = new Q136();
        System.out.println(q.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            // res ^= nums[i]; // XOR Gate Function here
            res = res ^ nums[i];
        }
        return res;
    }
}
