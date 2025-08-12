
import java.util.Scanner;


class Q2520 {
    static Scanner sc =new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter Some Number : ");
        int num = sc.nextInt();
        Q2520 res = new Q2520();
        System.out.println("Output Count : "+res.countDigits(num));
    }
    public int countDigits(int num) {
        int orgNum = num;
        int count = 0;
        while (num>0) {
            int lastNum = num%10;
            if (lastNum !=0 && orgNum%lastNum ==0) {
                count ++;
            }
            num /= 10;
        }
        return count;
    }
}