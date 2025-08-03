class Q9 {
    public static void main(String[] args) {
        int x = 121;
        Q9 result = new Q9();
        boolean res = result.isPalindrome(x);
        System.out.println(res);
    }
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev == temp) {
            return true;
        }
        return false;
    }
}