import java.util.Scanner;
public class Task112217{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n = n - n % 2;
        if (n >= 2) {
            while (n >= 2) {
                int k = 1;
                for (int i = 1; i <= n; i++) {
                    k *= 2;
                }
                System.out.print(k + " ");
                n -= 2;
            }
        }
        else{
            System.out.print(0);
            }
    }
}
