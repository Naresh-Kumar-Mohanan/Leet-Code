
import java.util.Arrays;

class Q66 {
    public static void main(String[] args) {
        int[] digits = { 9 };
        Q66 res = new Q66();
        System.out.println(Arrays.toString(res.plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        return arr;

    }
}