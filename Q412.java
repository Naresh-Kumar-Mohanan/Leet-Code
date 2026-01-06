import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q412 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Q412 res = new Q412();
        System.out.println(res.fizzBuzz(n));
    }

    public List<String> fizzBuzz(int n) {
        List<String> l = new LinkedList<>();
        int num = 1;
        while (num <= n) {
            if (num % 3 == 0 && num % 5 == 0) {
                l.add("FizzBuzz");
            } else if (num % 3 == 0) {
                l.add("Fizz");
            } else if (num % 5 == 0) {
                l.add("Buzz");
            } else {
                l.add(String.valueOf(num));
            }
            num++;
        }
        return l;
    }
}
