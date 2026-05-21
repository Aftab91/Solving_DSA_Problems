import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isAmstrong(n));
    }
    //amstrong number function
    static boolean isAmstrong(int num){
        int ans = num;
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == ans;
    }
}
