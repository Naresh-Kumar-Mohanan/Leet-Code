import java.util.Scanner;

class Q231 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Some Number : ");
        int n = sc.nextInt();
        Q231 q = new Q231();
        boolean b = q.isPowerOfTwo(n);
        System.out.println(b);
    }

    public boolean isPowerOfTwo(int n) {
        // return n >= 0 && Integer.bitCount(n) == 1;
        // return n>=0 && ((n&(n-1)) == 1);
        if (n >= 0 && ((n & (n - 1)) == 1)) {
            return true;
        } else
            return false;
    }
}