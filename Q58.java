import java.util.Scanner;
class Q58 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter Some Words : ");
        String s = sc.nextLine();
        Q58 res =new Q58();
        System.out.println(res.lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        String str =s.trim();
        int count=0;
        for (int i = str.length()-1; i>=0; i--) {
            if(str.charAt(i)!=' ') {
                count++;
            } else 
                break;
        }
        return count;
    }
}