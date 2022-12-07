import java.util.Scanner;
public class Task265{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        if (n <= k){
            System.out.println(m * 2);
        }
        if (n > k && n % k == 0){
            System.out.println(n / k * (m * 2));
        }
        if (n > k && n % k != 0 && n % k <= k * 0.5){
            System.out.println((n / k * (m * 2)) + m);
        }
        if (n > k && n % k != 0 && n % k > k * 0.5){
            System.out.println((n / k * (m * 2)) + m * 2);
        }
    }
}
