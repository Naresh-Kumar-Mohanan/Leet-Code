class Q2348 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 0, 2, 0, 0 };
        Q2348 res = new Q2348();
        System.out.println(res.zeroFilledSubarray(nums));
    }

    public long zeroFilledSubarray(int[] nums) {
        long totalCount = 0;
        int zeroCount = 0;

        for (int value : nums) {
            zeroCount = (value != 0) ? 0 : zeroCount + 1;
            totalCount += zeroCount;
        }
        return totalCount;
    }
}