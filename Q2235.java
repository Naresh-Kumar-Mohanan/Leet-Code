import java.util.Scanner;

class Q2235 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num 2 : ");
        int num2 = sc.nextInt();
        Q2235 res = new Q2235();
        System.out.println(res.sum(num1, num2));
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}