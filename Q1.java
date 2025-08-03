class Q1 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        Q1 solver = new Q1();
        int[] res = solver.twoSum(nums, target);
        System.out.println(res[0] + ", " + res[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                sum = num1 + num2;
                if (sum == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}