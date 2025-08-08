
import java.util.Arrays;




class Q27 {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        Q27 q = new Q27();
        System.out.println(q.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(val != nums[i]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}