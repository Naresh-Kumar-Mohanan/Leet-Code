class Q88 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        Q88 q = new Q88();
        q.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int mergeIndex = m + n - 1;
        
        while (index2 >= 0) {
            if (index1 < 0 || nums1[index1] <= nums2[index2]) {
                nums1[mergeIndex] = nums2[index2];
                index2--;
            } else {
                nums1[mergeIndex] = nums1[index1];
                index1--;
            }
            mergeIndex--;
        }
    }
}