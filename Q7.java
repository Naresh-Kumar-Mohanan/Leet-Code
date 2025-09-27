public class Q7 {
    public static void main(String[] args) {
        Q7 res = new Q7();
        int x = 1534236469;
        System.out.println(res.reverse(x));
    }

    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        } else
            return (int) rev;
    }
}
