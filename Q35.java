import java.util.Scanner;
class Q35 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        int target = sc.nextInt();
        Q35 obj = new Q35();
        int res = obj.searchInsert(nums, target);
        System.out.println(res);
    }

    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>= target){
                return i;
            }
        }
        return nums.length;
    }
}