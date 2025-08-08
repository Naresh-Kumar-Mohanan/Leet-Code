
import java.util.*;

class Q69 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Some Number : ");
        int x = sc.nextInt();
        Q69 q = new Q69();
        System.out.println(q.mySqrt(x));
    }

    public int mySqrt(int x) {
        int a = 1;
        int b = x;
        int ans = 0;
        while (a <= b) {
            int y = a + (b - a) / 2;
            if ((long)y * y <= x) {
                ans = y;
                a = y + 1;
            } else {
                b = y - 1;
            }
        }
        return ans;
        /* 
        // Working But Error When High Amount of value Given...,
        int i = 1;
        while (i * i <= x) {
            i++;
        }
        return i - 1; */
    }
}