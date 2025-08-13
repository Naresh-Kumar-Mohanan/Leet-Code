import java.util.Scanner;

class Q326 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        Q326 res = new Q326();
        System.out.println(res.isPowerOfThree(n));
    }

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}