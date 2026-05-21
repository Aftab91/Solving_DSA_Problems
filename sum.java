
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    public static int sum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a+b;
    }
}
