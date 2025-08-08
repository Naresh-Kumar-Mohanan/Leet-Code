import java.util.*;

class Q258 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter some Number : ");
        int num = sc.nextInt();
        Q258 q = new Q258();
        System.out.println(q.addDigits(num));
    }

    public int addDigits(int num) {
        if (num == 0)
            return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }
}