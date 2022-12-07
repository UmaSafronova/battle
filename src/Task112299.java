import java.util.Scanner;
public class Task112299{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            A[i] = in.nextInt();
        }
        int k = in.nextInt(), m = in.nextInt();
        for (int i = k - 1; i <= (m + k) / 2 - 1; i++) {
            int t = A[i];
            A[i] = A[m - 1 - i + k - 1];
            A[m - 1 - i + k - 1] = t;
        }
        for (int i = 0; i <= n - 1; i++){
            System.out.print(A[i] + " ");
        }
    }
}
