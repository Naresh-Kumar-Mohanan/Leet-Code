import java.util.Scanner;

public class Q507 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        Q507 res = new Q507();
        System.out.println(res.checkPerfectNumber(num));
    }

    public boolean checkPerfectNumber(int num) {
        int sum = 1;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;

        // Fastes Way
        // return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
    }
}
