import java.util.Scanner;
public class Task3803{
    static Scanner in = new Scanner(System.in);
    public static int C(int n, int k){
        if (k == 0 || k == n){
            return 1;
        }
        return C(n - 1, k - 1) + C(n - 1, k);
    }
    public static void main(String[]args){
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.print(C(n, k));
    }
}
